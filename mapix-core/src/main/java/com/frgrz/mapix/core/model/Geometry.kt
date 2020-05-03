package com.frgrz.mapix.core.model

import com.google.gson.annotations.SerializedName

data class Geometry(
    @SerializedName("location") val location: Coordinate,
    @SerializedName("location_type") val locationType: String,
    @SerializedName("viewport") val viewport: Bounds
)