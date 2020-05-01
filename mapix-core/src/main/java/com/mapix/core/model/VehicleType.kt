package com.mapix.core.model

import com.google.gson.annotations.SerializedName

enum class VehicleType {

    @SerializedName("RAIL")
    RAIL,

    @SerializedName("METRO_RAIL")
    METRO_RAIL,

    @SerializedName("SUBWAY")
    SUBWAY,

    @SerializedName("TRAM")
    TRAM,

    @SerializedName("MONORAIL")
    MONORAIL,

    @SerializedName("HEAVY_RAIL")
    HEAVY_RAIL,

    @SerializedName("COMMUTER_TRAIN")
    COMMUTER_TRAIN,

    @SerializedName("HIGH_SPEED_TRAIN")
    HIGH_SPEED_TRAIN,

    @SerializedName("LONG_DISTANCE_TRAIN")
    LONG_DISTANCE_TRAIN,

    @SerializedName("BUS")
    BUS,

    @SerializedName("INTERCITY_BUS")
    INTERCITY_BUS,

    @SerializedName("TROLLEYBUS")
    TROLLEYBUS,

    @SerializedName("SHARE_TAXI")
    SHARE_TAXI,

    @SerializedName("FERRY")
    FERRY,

    @SerializedName("CABLE_CAR")
    CABLE_CAR,

    @SerializedName("GONDOLA_LIFT")
    GONDOLA_LIFT,

    @SerializedName("FUNICULAR")
    FUNICULAR,

    @SerializedName("OTHER ")
    OTHER,
}