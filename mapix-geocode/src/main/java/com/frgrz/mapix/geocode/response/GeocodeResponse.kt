package com.frgrz.mapix.geocode.response

import com.google.gson.annotations.SerializedName
import com.frgrz.mapix.core.model.Address

data class GeocodeResponse(
    @SerializedName("status") val status: GeocodeResponseStatus,
    @SerializedName("error_message") val errorMessage: String,
    @SerializedName("results") val results: List<Address>
)