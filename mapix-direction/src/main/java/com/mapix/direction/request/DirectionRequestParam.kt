package com.mapix.direction.request

import com.mapix.core.model.Coordinate
import com.mapix.core.model.Language
import com.mapix.core.model.TransitMode
import com.mapix.core.model.TransportMode
import com.mapix.core.model.AvoidType
import java.lang.StringBuilder
import java.util.*
import kotlin.collections.ArrayList

class DirectionRequestParam(
    var origin: Coordinate,
    var destination: Coordinate,
    var apiKey: String,
    var transportMode: TransportMode? = null,
    var departureTime: String? = null,
    var language: Language? = null,
    var unit: Unit? = null,
    var avoidTypes: ArrayList<AvoidType> = arrayListOf(),
    var transitModes: ArrayList<TransitMode> = arrayListOf(),
    var isAlternatives: Boolean? = null,
    var waypoints: ArrayList<Coordinate> = arrayListOf(),
    var isOptimizeWaypoints: Boolean = false
) {
    fun getCoordinateString(coordinate: Coordinate): String {
        val sb = StringBuilder()
        sb.append(coordinate.latitude)
        sb.append(",")
        sb.append(coordinate.longitude)
        return sb.toString()
    }

    fun getWaypointsString(): String? {
        if (waypoints.isEmpty()) return null

        val sb = StringBuilder()

        if (isOptimizeWaypoints) {
            sb.append("optimize:true|")
        }

        waypoints.forEachIndexed { index, coordinate ->
            sb.append(coordinate.latitude)
            sb.append(",")
            sb.append(coordinate.longitude)

            if (index != waypoints.size) {
                sb.append("|")
            }
        }

        return sb.toString()
    }

    fun getAvoidTypeString(): String? {
        if (avoidTypes.isEmpty()) return null

        return avoidTypes.joinToString(separator = "|") {
            it.toString().toLowerCase(Locale.getDefault())
        }
    }

    fun getTransitModeString():String?{
        if(transitModes.isEmpty()) return null

        return transitModes.joinToString(separator = "|") {
            it.toString().toLowerCase(Locale.getDefault())
        }
    }
}