package com.frgrz.mapix.geocode.request

import com.frgrz.mapix.core.model.AddressTypes
import com.frgrz.mapix.core.model.Coordinate
import com.frgrz.mapix.core.model.Language
import com.frgrz.mapix.core.model.LocationType
import java.lang.StringBuilder

class ReverseRequestParam(
   var apiKey: String,
   var placeId: String? = null,
   var language: Language? = null,
   var coordinate: Coordinate?=null,
   var locationTypes:ArrayList<LocationType> = arrayListOf(),
    var resultTypes:ArrayList<AddressTypes> = arrayListOf()
) {

    fun addLocationType(locationType: LocationType) {
        if (!locationTypes.contains(locationType)) {
            this.locationTypes.add(locationType)
        }
    }

    fun addResultType(addressTypes: AddressTypes) {
        if (!resultTypes.contains(addressTypes)) {
            this.resultTypes.add(addressTypes)
        }
    }

    fun getLocationTypesUrl(): String? {
        return if (locationTypes.isEmpty()) {
            null
        } else {
            locationTypes.joinToString(separator = "|") { it.toString() }
        }
    }

    fun getResultTypesUrl(): String? {
        return if (resultTypes.isEmpty()) {
            null
        } else {
            resultTypes.joinToString(separator = "|") { it.toString() }
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