package org.wikipedia.dataclient;

import android.text.TextUtils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.LruCache;

import org.wikipedia.AppAdapter;
import org.wikipedia.json.GsonUtil;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public final class ServiceFactory<S> {
    private static final int SERVICE_CACHE_SIZE = 8;
    private LruCache<Long, S> serviceCache = new LruCache<>(SERVICE_CACHE_SIZE);
    private Class<S> clazz;

    public ServiceFactory(Class<S> clazz) {
        this.clazz = clazz;
    }

    public S get(@NonNull WikiSite wiki) {
        long hashCode = wiki.hashCode();
        if (serviceCache.get(hashCode) != null) {
            return serviceCache.get(hashCode);
        }

        Retrofit r = createRetrofit(wiki, TextUtils.isEmpty(AppAdapter.get().getMediaWikiBaseUrl()) ? wiki.url() + "/" : AppAdapter.get().getMediaWikiBaseUrl());

        S s = r.create(clazz);
        serviceCache.put(hashCode, s);
        return s;
    }

    public static <T> T get(@NonNull WikiSite wiki, Class<T> service) {
        return get(wiki, AppAdapter.get().getMediaWikiBaseUrl(), service);
    }

    public static <T> T get(@NonNull WikiSite wiki, @Nullable String baseUrl, Class<T> service) {
        Retrofit r = createRetrofit(wiki, TextUtils.isEmpty(baseUrl) ? wiki.url() + "/" : baseUrl);
        return r.create(service);
    }

    private static Retrofit createRetrofit(@NonNull WikiSite wiki, @NonNull String baseUrl) {
        return new Retrofit.Builder()
                .client(AppAdapter.get().getOkHttpClient(wiki))
                .baseUrl(baseUrl)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(GsonUtil.getDefaultGson()))
                .build();
    }
}
