package com.frgrz.mapix.place.request

import com.frgrz.mapix.core.model.Coordinate
import com.frgrz.mapix.place.api.PlaceApi

class PlaceSearchRequest(private val connection: PlaceApi) {

    fun nearbySearch(center: Coordinate, radius: Int): NearbySearchRequest {
        return NearbySearchRequest(connection, center, radius)
    }

    fun findPlacefromText(text: String) {

    }

    fun textSearch(){

    }
}
