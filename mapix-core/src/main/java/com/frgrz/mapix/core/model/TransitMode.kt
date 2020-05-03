package com.frgrz.mapix.core.model

import com.google.gson.annotations.SerializedName

/**
 * Transit mode.
 */
enum class TransitMode {
    // Indicates that the calculated route should prefer travel by bus.
    @SerializedName("bus")
    BUS,

    // Indicates that the calculated route should prefer travel by subway.
    @SerializedName("subway")
    SUBWAY,

    // Indicates that the calculated route should prefer travel by train.
    @SerializedName("train")
    TRAIN,

    // Indicates that the calculated route should prefer travel by tram and light rail.
    @SerializedName("tram")
    TRAM,

    // Indicates that the calculated route should prefer travel by train, tram, light rail, and subway.
    @SerializedName("rail")
    RAIL
}