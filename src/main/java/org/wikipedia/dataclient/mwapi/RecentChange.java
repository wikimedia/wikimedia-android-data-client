package org.wikipedia.dataclient.mwapi;

import com.google.gson.annotations.SerializedName;

public class RecentChange {
    private String type;
    private String title;
    @SerializedName("old_revid")
    private String oldRevisionId;

    public String getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }

    public String getOldRevisionId() {
        return oldRevisionId;
    }
}