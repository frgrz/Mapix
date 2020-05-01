package com.mapix.geocode.api

import com.mapix.core.network.GoogleMapsApiConnection

class GeocodeApi(
    private val api: GoogleMapsApiConnection,
    internal val apiKey: String
) {

    private var service: GeocodeApiService? = null

    fun getService(): GeocodeApiService {
        if (service == null) {
            service = api.instance.create(GeocodeApiService::class.java)
        }

        return service!!
    }
}
