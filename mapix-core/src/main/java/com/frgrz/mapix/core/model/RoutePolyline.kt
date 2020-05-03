package com.frgrz.mapix.core.model

import com.google.android.gms.maps.model.LatLng
import com.google.gson.annotations.SerializedName
import com.google.maps.android.PolyUtil

data class RoutePolyline(
    @SerializedName("points") val rawPointList: String
) {

    val pointList: List<LatLng>
        get() = PolyUtil.decode(rawPointList)

}