package com.frgrz.mapix.geocode.request

import com.frgrz.mapix.core.model.AddressTypes
import com.frgrz.mapix.core.model.Coordinate
import com.frgrz.mapix.core.model.LocationType
import java.lang.StringBuilder

class ReverseRequestParam(apiKey: String = "") {
    var placeId: String? = null
        private set
    var language: String? = null
        private set

    private var coordinate: Coordinate? = null

    var apiKey: String = apiKey
        private set

    fun setApiKey(apiKey: String): ReverseRequestParam {
        this.apiKey = apiKey
        return this
    }

    fun setLanguage(language: String) {
        this.language = language
    }

    fun setPlaceId(placeId: String) {
        this.placeId = placeId
    }

    fun setCoordinate(coordinate: Coordinate) {
        this.coordinate = coordinate
    }

    private var locationTypes = arrayListOf<LocationType>()

    private var resultType = arrayListOf<AddressTypes>()

    fun addLocationType(locationType: LocationType) {
        if (!locationTypes.contains(locationType)) {
            this.locationTypes.add(locationType)
        }
    }

    fun addResultType(addressTypes: AddressTypes) {
        if (!resultType.contains(addressTypes)) {
            this.resultType.add(addressTypes)
        }
    }

    fun getUrlFormattedLocationTypes(): String? {
        return if (locationTypes.isEmpty()) {
            null
        } else {
            locationTypes.joinToString(separator = "|") { it.toString() }
        }
    }

    fun getUrlFormattedResultTypes(): String? {
        return if (resultType.isEmpty()) {
            null
        } else {
            resultType.joinToString(separator = "|") { it.toString() }
        }
    }

    fun getUrlFormattedCoordinates(): String? {
        return if (coordinate == null) {
            null
        } else {
            val sb = StringBuilder()
            sb.append(coordinate!!.latitude)
            sb.append(",")
            sb.append(coordinate!!.longitude)
            sb.toString()
        }
    }
}