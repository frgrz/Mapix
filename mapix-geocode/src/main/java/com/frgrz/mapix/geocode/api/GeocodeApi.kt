package com.frgrz.mapix.geocode.api

import com.frgrz.mapix.core.network.GoogleMapsApiConnection

class GeocodeApi(
    private val api: GoogleMapsApiConnection,
    internal val apiKey: String
) {

    private var service: GeocodeApiService? = null

    fun getService(): GeocodeApiService {
        if (service == null) {
            service = api.connect()
                .create(GeocodeApiService::class.java)
        }

        return service!!
    }

    fun disconnect() {
        api.disconnect()
        service = null
    }
}
