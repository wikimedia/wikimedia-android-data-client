package org.wikipedia.page;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;

import java.util.List;

/**
 * Represents a particular page along with its full contents.
 */
public class Page {
    @VisibleForTesting static final int MEDIAWIKI_ORIGIN = 0;
    @VisibleForTesting static final int RESTBASE_ORIGIN = 1;

    @NonNull private final PageTitle title;
    @NonNull private final List<Section> sections;
    @NonNull private final PageProperties pageProperties;

    /** Regular constructor */
    public Page(@NonNull PageTitle title, @NonNull List<Section> sections,
                @NonNull PageProperties pageProperties) {
        this.title = title;
        this.sections = sections;
        this.pageProperties = pageProperties;
    }

    @NonNull public PageTitle getTitle() {
        return title;
    }

    @NonNull public List<Section> getSections() {
        return sections;
    }

    public String getDisplayTitle() {
        return pageProperties.getDisplayTitle();
    }

    @Nullable public String getTitlePronunciationUrl() {
        return getPageProperties().getTitlePronunciationUrl();
    }

    @NonNull public PageProperties getPageProperties() {
        return pageProperties;
    }

    public boolean couldHaveReadMoreSection() {
        return getTitle().namespace() == Namespace.MAIN;
    }

    public boolean isFilePage() {
        return title.isFilePage();
    }

    public boolean isMainPage() {
        return pageProperties.isMainPage();
    }

    public boolean isArticle() {
        return !isMainPage() && getTitle().namespace() == Namespace.MAIN;
    }

    public boolean isProtected() {
        return !getPageProperties().canEdit();
    }
}
