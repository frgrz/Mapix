package com.frgrz.mapix.geocode

import com.frgrz.mapix.geocode.api.GeocodeApi
import com.frgrz.mapix.geocode.request.GeocodeRequest
import com.frgrz.mapix.geocode.request.ReverseRequest

object RxGeocode {

    fun geocode(connection: GeocodeApi): GeocodeRequest =
        GeocodeRequest(connection)

    fun reverse(connection: GeocodeApi): ReverseRequest =
        ReverseRequest(connection)

}
