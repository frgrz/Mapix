package com.frgrz.mapix.place.request

import com.frgrz.mapix.core.model.Coordinate
import com.frgrz.mapix.place.api.PlaceApi
import com.frgrz.mapix.place.response.NearbyResponse
import io.reactivex.Single

class NearbySearchRequest(
    private val connection: PlaceApi,
    center: Coordinate,
    radius: Int
) {
    private val param: NearbySearchRequestParam =
        NearbySearchRequestParam(center, radius)
            .setApiKey(connection.apiKey)

    fun setCenter(center: Coordinate): NearbySearchRequest {
        param.setCenter(center)
        return this
    }

    fun setRadius(radius: Int): NearbySearchRequest {
        param.setRadius(radius)
        return this
    }

    fun execute(): Single<NearbyResponse> {
        return connection
            .nearbySearchService()
            .getNearbyPlaces(
                location = param.getCenter(),
                radius = param.radius,
                apiKey = param.apiKey
            )
    }
}

