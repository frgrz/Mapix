package com.frgrz.mapix.geocode.response

import com.google.gson.annotations.SerializedName

/**
 * A class holding the response status for a Geocode API query
 */
enum class GeocodeResponseStatus {
    /** Everything went well */
    @SerializedName("OK")
    OK,

    /** There was no results associated to this query, refine your query parameters */
    @SerializedName("ZERO_RESULTS")
    ZERO_RESULTS,

    /** The query has exceeded it's maximal length, you may have too many parameters */
    @SerializedName("OVER_QUERY_LIMIT")
    OVER_QUERY_LIMIT,

    /** The request failed due to bad credentials make sure you've registered an api key for this service, and have proper billing settings in Google Cloud Platform */
    @SerializedName("REQUEST_DENIED")
    REQUEST_DENIED,

    /** The request is invlid propably due to bad parameters */
    @SerializedName("INVALID_REQUEST")
    INVALID_REQUEST,

    /** An unknown error happened */
    @SerializedName("UNKNOWN_ERROR")
    UNKNOWN_ERROR
}
