package com.mapix.direction.api

import com.mapix.core.network.GoogleMapsApiConnection

class DirectionApi(
    private val api: GoogleMapsApiConnection,
    internal val apiKey: String
) {

    private var service: DirectionService? = null

    fun getService(): DirectionService {
        if (service == null) {
            service = api.instance.create(DirectionService::class.java)
        }

        return service!!
    }

}
