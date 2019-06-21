package org.wikipedia.dataclient.mwapi;

import androidx.annotation.NonNull;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class GeoSearchItem {

    private String title;
    @SerializedName("lat") private double latitude;
    @SerializedName("lon") private double longitude;
    @SerializedName("dist") private double distance;

    @NonNull public String getTitle() {
        return title;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getDistance() {
        return distance;
    }
}
