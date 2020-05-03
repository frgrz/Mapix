package com.frgrz.mapix.direction.response

import com.google.gson.annotations.SerializedName
import com.frgrz.mapix.core.model.GeocodedWaypoint
import com.frgrz.mapix.core.model.Route

class DirectionResponse(

    @SerializedName("geocoded_waypoints")
    val geocodedWaypointList: List<GeocodedWaypoint>,

    @SerializedName("routes")
    val routeList: List<Route>,

    @SerializedName("status")
    val status: DirectionResponseStatus,

    @SerializedName("error_message")
    val errorMessage: String

)
