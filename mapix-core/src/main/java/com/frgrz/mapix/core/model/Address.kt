package com.frgrz.mapix.core.model

import com.google.gson.annotations.SerializedName

data class Address(
    @SerializedName("address_components") val addressComponents: List<AddressComponent>,
    @SerializedName("formatted_address") val formattedAddress: String,
    @SerializedName("geometry") val geometry: Geometry,
    @SerializedName("types") val addressTypes: List<String>,
    @SerializedName("place_id") val placeId: String
)