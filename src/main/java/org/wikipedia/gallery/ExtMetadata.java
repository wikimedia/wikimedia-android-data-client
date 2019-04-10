package org.wikipedia.gallery;

import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.StringUtils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

@SuppressWarnings("unused")
public class ExtMetadata {
    @SerializedName("DateTime") @Nullable private Values dateTime;
    @SerializedName("ObjectName") @Nullable private Values objectName;
    @SerializedName("CommonsMetadataExtension") @Nullable private Values commonsMetadataExtension;
    @SerializedName("Categories") @Nullable private Values categories;
    @SerializedName("Assessments") @Nullable private Values assessments;
    @SerializedName("GPSLatitude") @Nullable private Values gpsLatitude;
    @SerializedName("GPSLongitude") @Nullable private Values gpsLongitude;
    @SerializedName("ImageDescription") @Nullable private Values imageDescription;
    @SerializedName("DateTimeOriginal") @Nullable private Values dateTimeOriginal;
    @SerializedName("Artist") @Nullable private Values artist;
    @SerializedName("Credit") @Nullable private Values credit;
    @SerializedName("Permission") @Nullable private Values permission;
    @SerializedName("AuthorCount") @Nullable private Values authorCount;
    @SerializedName("LicenseShortName") @Nullable private Values licenseShortName;
    @SerializedName("UsageTerms") @Nullable private Values usageTerms;
    @SerializedName("LicenseUrl") @Nullable private Values licenseUrl;
    @SerializedName("AttributionRequired") @Nullable private Values attributionRequired;
    @SerializedName("Copyrighted") @Nullable private Values copyrighted;
    @SerializedName("Restrictions") @Nullable private Values restrictions;
    @SerializedName("License") @Nullable private Values license;

    @NonNull public Values dateTime() {
        return dateTime != null ? dateTime : new Values();
    }

    @NonNull public Values dateTimeOriginal() {
        return dateTimeOriginal != null ? dateTimeOriginal : new Values();
    }

    @NonNull public Values licenseShortName() {
        return licenseShortName != null ? licenseShortName : new Values();
    }

    @NonNull public Values licenseUrl() {
        return licenseUrl != null ? licenseUrl : new Values();
    }

    @NonNull public Values license() {
        return license != null ? license : new Values();
    }

    @NonNull public Values imageDescription() {
        return imageDescription != null ? imageDescription : new Values();
    }

    @NonNull public Values objectName() {
        return objectName != null ? objectName : new Values();
    }

    @NonNull public Values usageTerms() {
        return usageTerms != null ? usageTerms : new Values();
    }

    @NonNull public Values artist() {
        return artist != null ? artist : new Values();
    }

    @NonNull public Values categories() {
        return categories != null ? categories : new Values();
    }

    @NonNull public Values gpsLatitude() {
        return gpsLatitude != null ? gpsLatitude : new Values();
    }

    @NonNull public Values gpsLongitude() {
        return gpsLongitude != null ? gpsLongitude : new Values();
    }

    public class Values {
        @SuppressWarnings("unused,NullableProblems") @Nullable private String value;
        @SuppressWarnings("unused,NullableProblems") @Nullable private String source;
        @SuppressWarnings("unused,NullableProblems") @Nullable private String hidden;

        @NonNull public String value() {
            return StringUtils.defaultString(value);
        }

        @NonNull public String source() {
            return StringUtils.defaultString(source);
        }
    }
}
