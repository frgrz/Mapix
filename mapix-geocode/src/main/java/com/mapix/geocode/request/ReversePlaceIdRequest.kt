package com.mapix.geocode.request

import com.mapix.core.model.AddressTypes
import com.mapix.core.model.LocationType
import com.mapix.geocode.api.GeocodeApi
import com.mapix.geocode.response.GeocodeResponse
import io.reactivex.Single

class ReversePlaceIdRequest(
    private val connection: GeocodeApi
) {
    private val param: ReverseRequestParam = ReverseRequestParam()
        .setApiKey(connection.apiKey)

    fun placeId(placeId: String): ReversePlaceIdRequest {
        param.setPlaceId(placeId)
        return this
    }

    fun addResultType(addressTypes: AddressTypes): ReversePlaceIdRequest {
        param.addResultType(addressTypes)
        return this
    }

    fun addLocationType(locationType: LocationType):ReversePlaceIdRequest{
        param.addLocationType(locationType)
        return this
    }

    fun setLanguage(language: String):ReversePlaceIdRequest{
        param.setLanguage(language)
        return this
    }

    fun execute(): Single<GeocodeResponse> {
        return connection.getService()
            .reverseGeocodeWithPlaceId(
                placeId = param.placeId,
                language = param.language,
                resultType = param.getUrlFormattedResultTypes(),
                locationTypes = param.getUrlFormattedLocationTypes(),
                key = param.apiKey
            )
    }
}