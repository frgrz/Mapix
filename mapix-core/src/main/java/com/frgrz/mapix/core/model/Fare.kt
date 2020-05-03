package com.frgrz.mapix.core.model

import com.google.gson.annotations.SerializedName

data class Fare(
    @SerializedName("currency") val currency: String,
    @SerializedName("value") val value: String,
    @SerializedName("text") val text: String
)