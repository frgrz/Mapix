package com.mapix.place

import com.mapix.place.api.PlaceApi
import com.mapix.place.request.PlaceSearchRequest

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
