package com.frgrz.mapix.direction.response

import com.google.gson.annotations.SerializedName

enum class DirectionResponseStatus {

    @SerializedName(" OK")
    OK,
    @SerializedName(" NOT_FOUND")
    NOT_FOUND,
    @SerializedName(" ZERO_RESULTS")
    ZERO_RESULTS,
    @SerializedName(" MAX_WAYPOINTS_EXCEEDED")
    MAX_WAYPOINTS_EXCEEDED,
    @SerializedName(" MAX_ROUTE_LENGTH_EXCEEDED")
    MAX_ROUTE_LENGTH_EXCEEDED,
    @SerializedName(" INVALID_REQUEST")
    INVALID_REQUEST,
    @SerializedName(" OVER_DAILY_LIMIT")
    OVER_DAILY_LIMIT,
    @SerializedName(" REQUEST_DENIED")
    REQUEST_DENIED,
    @SerializedName(" UNKNOWN_ERROR")
    UNKNOWN_ERROR;

    fun isOk() = this == OK
}
