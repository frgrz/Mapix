package com.frgrz.mapix.core.model

import com.google.gson.annotations.SerializedName

class Bounds(
    @SerializedName("southwest") var southWest: Coordinate,
    @SerializedName("northeast") var northEast: Coordinate
)