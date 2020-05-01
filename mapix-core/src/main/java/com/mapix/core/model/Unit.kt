package com.mapix.core.model

import com.google.gson.annotations.SerializedName

/**
 * Distance Unit.
 */
enum class Unit {
    // Specifies usage of the metric system.
    // Textual distances are returned using kilometers and meters.
    @SerializedName("metric")
    METRIC,

    // Specifies usage of the Imperial (English) system.
    // Textual distances are returned using miles and feet.
    @SerializedName("imperial")
    IMPERIAL
}