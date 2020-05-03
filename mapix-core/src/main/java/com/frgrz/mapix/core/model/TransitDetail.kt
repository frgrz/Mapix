package com.frgrz.mapix.core.model

import com.google.gson.annotations.SerializedName

data class TransitDetail(
    @SerializedName("arrival_stop") val arrivalStopPoint: StopPoint,
    @SerializedName("arrival_time") val arrivalTime: TimeInfo,
    @SerializedName("departure_stop") val departureStopPoint: StopPoint,
    @SerializedName("departure_time") val departureTime: TimeInfo
)
