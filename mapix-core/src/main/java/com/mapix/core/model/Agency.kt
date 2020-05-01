package com.mapix.core.model

import com.google.gson.annotations.SerializedName

data class Agency(
    @SerializedName("name") val name: String,
    @SerializedName("url") val url: String
)