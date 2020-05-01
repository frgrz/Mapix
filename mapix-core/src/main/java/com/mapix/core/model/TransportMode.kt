package com.mapix.core.model

import com.google.gson.annotations.SerializedName

enum class TransportMode {
    // Indicates standard driving directions using the road network.
    @SerializedName("driving")
    DRIVING,

    // Requests walking directions via pedestrian paths & sidewalks (where available).
    @SerializedName("walking")
    WALKING,

    // Requests bicycling directions via bicycle paths & preferred streets (where available).
    @SerializedName("bicycling")
    BICYCLING,

    // Requests directions via public transit routes (where available).
    @SerializedName("transit")
    TRANSIT
}