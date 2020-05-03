package com.frgrz.mapix.core.model

import com.google.gson.annotations.SerializedName

enum class LocationType {
    @SerializedName("ROOFTOP")
    ROOFTOP,
    @SerializedName("RANGE_INTERPOLATED")
    RANGE_INTERPOLATED,
    @SerializedName("GEOMETRIC_CENTER")
    GEOMETRIC_CENTER,
    @SerializedName("APPROXIMATE")
    APPROXIMATE;
}
