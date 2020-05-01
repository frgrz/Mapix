package com.mapix.geocode.request

import com.mapix.geocode.api.GeocodeApi

class ReverseRequest(private val connection: GeocodeApi) {

    fun forPlaceId(): ReversePlaceIdRequest {
        return ReversePlaceIdRequest(connection)
    }

    fun forCoordinate(): ReverseCoordinateRequest {
        return ReverseCoordinateRequest(connection)
    }
}
