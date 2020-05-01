package com.mapix.core.model

import com.google.gson.annotations.SerializedName

data class TimeInfo(
    @SerializedName("text") val text: String,
    @SerializedName("time_zone") val timeZone: String,
    @SerializedName("value") val value: String
)