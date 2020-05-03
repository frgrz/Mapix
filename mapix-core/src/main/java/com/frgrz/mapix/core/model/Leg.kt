package com.frgrz.mapix.core.model

import com.google.android.gms.maps.model.LatLng
import com.google.gson.annotations.SerializedName
import com.frgrz.mapix.core.utils.DirectionConverter

data class Leg (
    @SerializedName("arrival_time") val arrivalTime: TimeInfo,
    @SerializedName("departure_time") val departureTime: TimeInfo,
    @SerializedName("distance") val distance: Info,
    @SerializedName("duration") val duration: Info,
    @SerializedName("duration_in_traffic") val durationInTraffic: Info,
    @SerializedName("end_address") val endAddress: String,
    @SerializedName("end_location") val endLocation: Coordinate,
    @SerializedName("start_address") val startAddress: String,
    @SerializedName("start_location") val startLocation: Coordinate,
    @SerializedName("steps") val stepList: List<Step>,
    @SerializedName("via_waypoint") val viaWaypointList: List<Waypoint>) {

    val directionPoint: ArrayList<LatLng>
        get() = DirectionConverter.getDirectionPoint(stepList)

    val sectionPoint: ArrayList<LatLng>
        get() = DirectionConverter.getSectionPoint(stepList)
}