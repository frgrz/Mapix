package com.frgrz.mapix.core.model

import com.google.gson.annotations.SerializedName

data class AddressComponent(
    @SerializedName("long_name") val longName: String,
    @SerializedName("short_name") val shortName: String,
    @SerializedName("types") val addressTypes: List<String>
)