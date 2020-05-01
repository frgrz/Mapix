package com.mapix.direction.request

import androidx.annotation.VisibleForTesting
import com.mapix.core.model.Coordinate
import com.mapix.direction.api.DirectionApi

class DirectionDestinationRequest(
    @VisibleForTesting
    private val connection: DirectionApi,
    @VisibleForTesting
    private val origin: Coordinate
) {

    private var waypointList: ArrayList<Coordinate> = arrayListOf()

    fun and(waypoint: Coordinate): DirectionDestinationRequest {
        waypointList.add(waypoint)
        return this
    }

    fun and(waypointList: List<Coordinate>): DirectionDestinationRequest {
        this.waypointList.addAll(waypointList)
        return this
    }

    fun to(destination: Coordinate): DirectionRequest {
        return DirectionRequest(connection, origin, destination, waypointList)
    }

}
