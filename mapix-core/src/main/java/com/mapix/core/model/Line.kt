package com.mapix.core.model

import com.google.gson.annotations.SerializedName

data class Line(
    @SerializedName("agencies") val agencyList: List<Agency>,
    @SerializedName("color") val color: String,
    @SerializedName("name") val name: String,
    @SerializedName("short_name") val shortName: String,
    @SerializedName("text_color") val textColor: String,
    @SerializedName("vehicle") val vehicle: Vehicle
)
