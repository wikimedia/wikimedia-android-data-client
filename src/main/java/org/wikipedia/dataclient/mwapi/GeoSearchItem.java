package org.wikipedia.dataclient.mwapi;

import androidx.annotation.NonNull;

import com.google.gson.annotations.SerializedName;

public class GeoSearchItem {

    @SuppressWarnings("unused") private String title;
    @SuppressWarnings("unused")
    @SerializedName("lat") private double latitude;
    @SuppressWarnings("unused")
    @SerializedName("lon") private double longitude;
    @SuppressWarnings("unused")
    @SerializedName("dist") private double distance;

    @NonNull public String getTitle() {
        return title;
    }

    @NonNull public double getLatitude() {
        return latitude;
    }

    @NonNull public double getLongitude() {
        return longitude;
    }

    @NonNull public double getDistance() {
        return distance;
    }
}
