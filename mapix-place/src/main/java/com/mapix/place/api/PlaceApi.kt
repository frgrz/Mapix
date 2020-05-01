package com.mapix.place.api

import com.mapix.core.network.GoogleMapsApiConnection

class PlaceApi(
    private val api: GoogleMapsApiConnection,
    internal val apiKey: String
) {

    //region Nearby Search

    private var nearbySearch: NearbySearchService? = null

    fun nearbySearchService(): NearbySearchService {
        if (nearbySearch == null) {
            nearbySearch = api.instance.create(NearbySearchService::class.java)
        }

        return nearbySearch!!
    }

    //endregion

}
