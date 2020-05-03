package com.frgrz.mapix.core.model

import com.google.gson.annotations.SerializedName

data class Info (
    @SerializedName("text") val text: String,
    @SerializedName("value") val value: Long
)