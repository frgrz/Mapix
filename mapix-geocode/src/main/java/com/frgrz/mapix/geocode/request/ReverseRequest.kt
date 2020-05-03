package com.frgrz.mapix.geocode.request

import com.frgrz.mapix.geocode.api.GeocodeApi

class ReverseRequest(private val connection: GeocodeApi) {

    fun forPlaceId(): ReversePlaceIdRequest {
        return ReversePlaceIdRequest(connection)
    }

    fun forCoordinate(): ReverseCoordinateRequest {
        return ReverseCoordinateRequest(connection)
    }
}
