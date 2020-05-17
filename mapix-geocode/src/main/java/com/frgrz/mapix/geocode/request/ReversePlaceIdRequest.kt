package com.frgrz.mapix.geocode.request

import com.frgrz.mapix.core.model.AddressTypes
import com.frgrz.mapix.core.model.Language
import com.frgrz.mapix.core.model.LocationType
import com.frgrz.mapix.geocode.api.GeocodeApi
import com.frgrz.mapix.geocode.response.GeocodeResponse
import io.reactivex.Single

class ReversePlaceIdRequest(
    private val connection: GeocodeApi
) {
    private val param: ReverseRequestParam = ReverseRequestParam(connection.apiKey)

    fun placeId(placeId: String): ReversePlaceIdRequest {
        param.placeId  =placeId
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

    fun setLanguage(language: Language):ReversePlaceIdRequest{
        param.language  =language
        return this
    }

    fun execute(): Single<GeocodeResponse> {
        return connection.getService()
            .reverseGeocodeWithPlaceId(
                placeId = param.placeId,
                language = param.language,
                resultType = param.getResultTypesUrl(),
                locationTypes = param.getLocationTypesUrl(),
                key = param.apiKey
            )
    }
}