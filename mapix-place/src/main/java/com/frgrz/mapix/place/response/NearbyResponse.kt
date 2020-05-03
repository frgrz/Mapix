package com.frgrz.mapix.place.response

import com.google.gson.annotations.SerializedName
import com.frgrz.mapix.core.model.Place

class NearbyResponse(
    @SerializedName("html_attributions") val htmlAttributions: List<String>,
    @SerializedName("results") val results: List<Place>,
    @SerializedName("status") val status: PlaceResponseStatus
)
