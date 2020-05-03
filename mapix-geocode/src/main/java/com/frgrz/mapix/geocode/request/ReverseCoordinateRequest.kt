package com.frgrz.mapix.geocode.request

import com.google.android.gms.maps.model.LatLng
import com.frgrz.mapix.core.model.AddressTypes
import com.frgrz.mapix.core.model.Coordinate
import com.frgrz.mapix.core.model.LocationType
import com.frgrz.mapix.geocode.api.GeocodeApi
import com.frgrz.mapix.geocode.response.GeocodeResponse
import io.reactivex.Single

class ReverseCoordinateRequest(
    private val connection: GeocodeApi
) {

    private val param = ReverseRequestParam()

    fun coordinate(coordinate: Coordinate): ReverseCoordinateRequest {
        param.setCoordinate(coordinate)
        return this
    }

    fun coordinate(latLng: LatLng): ReverseCoordinateRequest {
        param.setCoordinate(Coordinate(latLng.latitude, latLng.longitude))
        return this
    }

    fun coordinate(latitude: Double, longitude: Double): ReverseCoordinateRequest {
        param.setCoordinate(Coordinate(latitude, longitude))
        return this
    }

    fun addResultType(addressTypes: AddressTypes): ReverseCoordinateRequest {
        param.addResultType(addressTypes)
        return this
    }

    fun addLocationType(locationType: LocationType): ReverseCoordinateRequest {
        param.addLocationType(locationType)
        return this
    }

    fun language(language: String): ReverseCoordinateRequest {
        param.setLanguage(language)
        return this
    }

    fun execute(): Single<GeocodeResponse> {
        return connection.getService()
            .reverseGeocodeWithCoordinates(
                coordinate = param.getUrlFormattedCoordinates(),
                language = param.language,
                resultType = param.getUrlFormattedResultTypes(),
                locationTypes = param.getUrlFormattedLocationTypes(),
                key = connection.apiKey
            )
    }
}

