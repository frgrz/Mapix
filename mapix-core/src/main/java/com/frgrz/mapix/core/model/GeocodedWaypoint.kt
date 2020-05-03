package com.frgrz.mapix.core.model

import com.google.gson.annotations.SerializedName

class GeocodedWaypoint (
    @SerializedName("geocoder_status") val status: String,
    @SerializedName("place_id") val placeId: String,
    @SerializedName("types") val typeList: List<String>
)
