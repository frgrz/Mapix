package com.frgrz.mapix.place

import com.frgrz.mapix.place.api.PlaceApi
import com.frgrz.mapix.place.request.PlaceSearchRequest

object RxPlace {

    fun placeSearch(api: PlaceApi): PlaceSearchRequest {
        return PlaceSearchRequest(api)
    }

    fun placeDetails(api: PlaceApi) {

    }

    fun placePhotos(api: PlaceApi) {

    }

    fun placeAutocomplete(api: PlaceApi) {

    }
}
