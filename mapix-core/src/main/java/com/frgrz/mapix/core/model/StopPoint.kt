package com.frgrz.mapix.core.model

import com.google.gson.annotations.SerializedName

class StopPoint(
    @SerializedName("location") val location: Coordinate,
    @SerializedName("name") val name: String
)
