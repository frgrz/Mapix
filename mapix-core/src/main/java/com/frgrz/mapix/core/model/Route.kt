package com.frgrz.mapix.core.model

import com.google.gson.annotations.SerializedName

data class Route(
    @SerializedName("bounds") val bound: Bounds,
    @SerializedName("copyrights") val copyrights: String,
    @SerializedName("legs") val legList: List<Leg>,
    @SerializedName("overview_polyline") val overviewPolyline: RoutePolyline,
    @SerializedName("summary") val summary: String,
    @SerializedName("fare") val fare: Fare,
    @SerializedName("warnings") val warningList: List<String>,
    @SerializedName("waypoint_order") val waypointOrderList: List<Long>
) {

    val totalDistance: Long
        get() {
            if (legList.isEmpty()) {
                return 0L
            }

            var totalDistance = 0L
            for (leg in legList) {
                totalDistance += leg.distance.value
            }

            return totalDistance
        }

    val totalDuration: Long
        get() {
            if (legList.isEmpty()) {
                return 0L
            }
            var totalDuration = 0L
            for (leg in legList) {
                totalDuration += leg.duration.value
            }
            return totalDuration
        }
}