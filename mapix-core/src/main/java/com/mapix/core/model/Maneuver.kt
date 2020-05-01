package com.mapix.core.model

import com.google.gson.annotations.SerializedName

/**
 * Action to take for the current step.
 */
enum class Maneuver {
    @SerializedName("merge")
    MERGE,
    @SerializedName("straight")
    STRAIGHT,
    @SerializedName("roundabout-left")
    ROUNDABOUT_LEFT,
    @SerializedName("roundabout-right")
    ROUNDABOUT_RIGHT,
    @SerializedName("uturn-left")
    U_TURN_LEFT,
    @SerializedName("uturn-right")
    U_TURN_RIGHT,
    @SerializedName("turn-slight-left")
    TURN_SLIGHT_LEFT,
    @SerializedName("turn-slight-right")
    TURN_SLIGHT_RIGHT,
    @SerializedName("ramp-left")
    RAMP_LEFT,
    @SerializedName("ramp-right")
    RAMP_RIGHT,
    @SerializedName("turn-left")
    TURN_LEFT,
    @SerializedName("turn-right")
    TURN_RIGHT,
    @SerializedName("fork-left")
    FORK_LEFT,
    @SerializedName("fork-right")
    FORK_RIGHT,
    @SerializedName("turn-sharp-left")
    TURN_SHARP_LEFT,
    @SerializedName("turn-sharp-right")
    TURN_SHARP_RIGHT,
    @SerializedName("keep-left")
    KEEP_LEFT,
    @SerializedName("keep-right")
    KEEP_RIGHT,
    @SerializedName("ferry")
    FERRY,
    @SerializedName("ferry-train")
    FERRT_TRAIN
}