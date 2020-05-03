package com.frgrz.mapix.core.model

import com.google.gson.annotations.SerializedName

/**
 * Route restriction to avoid.
 */
enum class AvoidType {
    // Indicates that the calculated route should avoid toll roads/bridges.
    @SerializedName("tolls")
    TOLLS,

    // Indicates that the calculated route should avoid highways.
    @SerializedName("highways")
    HIGHWAYS,

    // Indicates that the calculated route should avoid ferries.
    @SerializedName("ferries")
    FERRIES,

    // Indicates that the calculated route should avoid indoor
    // steps for walking and transit directions.
    @SerializedName("indoor")
    INDOOR
}