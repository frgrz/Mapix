package com.frgrz.mapix.geocode.response

import com.google.gson.annotations.SerializedName

enum class GeocodeResponseStatus {
    @SerializedName("OK")
    OK,
    @SerializedName("ZERO_RESULTS")
    ZERO_RESULTS,
    @SerializedName("OVER_QUERY_LIMIT")
    OVER_QUERY_LIMIT,
    @SerializedName("REQUEST_DENIED")
    REQUEST_DENIED,
    @SerializedName("INVALID_REQUEST")
    INVALID_REQUEST,
    @SerializedName("UNKNOWN_ERROR")
    UNKNOWN_ERROR
}
