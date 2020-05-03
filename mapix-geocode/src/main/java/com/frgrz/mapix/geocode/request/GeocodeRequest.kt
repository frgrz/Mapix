package com.frgrz.mapix.geocode.request

import com.frgrz.mapix.core.model.AddressTypes
import com.frgrz.mapix.core.model.Bounds
import com.frgrz.mapix.core.model.Language
import com.frgrz.mapix.geocode.api.GeocodeApi
import com.frgrz.mapix.geocode.response.GeocodeResponse
import io.reactivex.Single

class GeocodeRequest(private val connection: GeocodeApi) {

    private val param = GeocodeRequestParam(connection.apiKey)

    fun address(address: String): GeocodeRequest {
        param.address = address
        return this
    }

    fun bounds(bounds: Bounds): GeocodeRequest {
        param.bounds = bounds
        return this
    }

    fun region(region: String): GeocodeRequest {
        param.region = region
        return this
    }

    fun language(language: Language): GeocodeRequest {
        param.language = language
        return this
    }

    fun addComponent(addressType: AddressTypes, value: String): GeocodeRequest {
        param.addComponents(addressType.toString(), value)
        return this
    }

    fun execute(): Single<GeocodeResponse> {
        return connection.getService()
            .geocode(
                address = param.address,
                components = param.getComponents(),
                language = param.language,
                region = param.region,
                bounds = param.getBounds(),
                key = param.apiKey
            )
    }
}
