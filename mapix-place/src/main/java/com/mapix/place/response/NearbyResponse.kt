package com.mapix.place.response

import com.google.gson.annotations.SerializedName
import com.mapix.core.model.Place

class NearbyResponse(
    @SerializedName("html_attributions") val htmlAttributions: List<String>,
    @SerializedName("results") val results: List<Place>,
    @SerializedName("status") val status: PlaceResponseStatus
)
