package com.mapix.geocode

import com.mapix.geocode.api.GeocodeApi
import com.mapix.geocode.request.GeocodeRequest
import com.mapix.geocode.request.ReverseRequest

object RxGeocode {

    fun geocode(connection: GeocodeApi): GeocodeRequest =
        GeocodeRequest(connection)

    fun reverse(connection: GeocodeApi): ReverseRequest =
        ReverseRequest(connection)

}
