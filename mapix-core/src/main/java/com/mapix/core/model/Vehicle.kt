package com.mapix.core.model

import com.google.gson.annotations.SerializedName

data class Vehicle(
    @SerializedName("icon") val iconUrl: String,
    @SerializedName("name") val name: String,
    @SerializedName("type") val type: String
)