package org.wikipedia.dataclient.mwapi;

import com.google.gson.annotations.SerializedName;

public class ImageDetails {

    @SerializedName("name")
    private String name;
    @SerializedName("title")
    private String title;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}