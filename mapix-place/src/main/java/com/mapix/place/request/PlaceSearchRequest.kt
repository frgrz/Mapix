package com.mapix.place.request

import com.mapix.core.model.Coordinate
import com.mapix.place.api.PlaceApi

class PlaceSearchRequest(private val connection: PlaceApi) {

    fun nearbySearch(center: Coordinate, radius: Int): NearbySearchRequest {
        return NearbySearchRequest(connection, center, radius)
    }

    fun findPlacefromText(text: String) {

    }

    fun textSearch(){

    }
}
