package com.frgrz.mapix.core.model

import com.google.android.gms.maps.model.LatLng
import com.google.gson.annotations.SerializedName

data class Coordinate(
    @SerializedName("lat") var latitude: Double,
    @SerializedName("lng") var longitude: Double
) {
    fun toLatLng(): LatLng {
        return LatLng(latitude, longitude)
    }
}