package com.frgrz.mapix.core.model

import com.google.gson.annotations.SerializedName

data class Step(
    @SerializedName("distance") val distance: Info,
    @SerializedName("duration") val duration: Info,
    @SerializedName("end_location") val endLocation: Coordinate,
    @SerializedName("html_instructions") val htmlInstruction: String,
    @SerializedName("maneuver") val maneuver: String,
    @SerializedName("start_location") val startLocation: Coordinate,
    @SerializedName("transit_details") val transitDetail: TransitDetail,
    @SerializedName("steps") val stepList: List<Step>,
    @SerializedName("polyline") val polyline: RoutePolyline,
    @SerializedName("travel_mode") val travelMode: String
) {

    val containSteps: Boolean
        get() = stepList.isNotEmpty()

}