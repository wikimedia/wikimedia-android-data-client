package org.wikipedia;

import android.support.annotation.NonNull;
import okhttp3.OkHttpClient;
import org.wikipedia.dataclient.SharedPreferenceCookieManager;
import org.wikipedia.login.LoginResult;

public abstract class AppAdapter {

    public abstract String getMediaWikiBaseUrl();
    public abstract String getRestbaseUriFormat();
    public abstract OkHttpClient getOkHttpClient();
    public abstract int getDesiredLeadImageDp();

    public abstract boolean isLoggedIn();
    public abstract String getUserName();
    public abstract String getPassword();
    public abstract void updateAccount(@NonNull LoginResult result);

    public abstract SharedPreferenceCookieManager getCookies();
    public abstract void setCookies(@NonNull SharedPreferenceCookieManager cookies);

    public abstract boolean logErrorsInsteadOfCrashing();

    private static AppAdapter INSTANCE;
    public static void set(AppAdapter instance) {
        INSTANCE = instance;
    }
    public static AppAdapter get() {
        if (INSTANCE == null) {
            throw new RuntimeException("Please provide an instance of AppAdapter when using this library.");
        }
        return INSTANCE;
    }
}
