package com.mapix.geocode.request

import com.mapix.core.model.AddressTypes
import com.mapix.core.model.Bounds
import com.mapix.geocode.api.GeocodeApi
import com.mapix.geocode.response.GeocodeResponse
import io.reactivex.Single

class GeocodeRequest(private val connection: GeocodeApi) {

    private val param = GeocodeRequestParam()
        .setApiKey(connection.apiKey)

    fun address(address: String): GeocodeRequest {
        param.setAddress(address)
        return this
    }

    fun bounds(bounds: Bounds): GeocodeRequest {
        param.setBounds(bounds)
        return this
    }

    fun region(region: String): GeocodeRequest {
        param.setRegion(region)
        return this
    }

    fun language(language:String): GeocodeRequest {
        param.setLanguage(language)
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
