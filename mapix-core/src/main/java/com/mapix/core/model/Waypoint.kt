package com.mapix.core.model

import com.google.gson.annotations.SerializedName


data class Waypoint(
    @SerializedName("location") val location: Coordinate,
    @SerializedName("step_index") val index: Int = 0,
    @SerializedName("step_interpolation") val interpolation: Double = 0.0
)