package com.mapix.direction.request

import com.mapix.core.model.*
import com.mapix.direction.api.DirectionApi
import com.mapix.direction.response.DirectionResponse
import io.reactivex.Single

class DirectionRequest(
    private val connection: DirectionApi,
    origin: Coordinate,
    destination: Coordinate,
    waypointList: ArrayList<Coordinate>
) {

    private val param: DirectionRequestParam =
        DirectionRequestParam(
            origin,
            destination,
            connection.apiKey,
            waypoints = waypointList
        )

    fun execute(): Single<DirectionResponse> {
        return connection.getService()
            .getDirection(
                param.getCoordinateString(param.origin),
                param.getCoordinateString(param.destination),
                param.getWaypointsString(),
                param.transportMode,
                param.departureTime,
                param.language,
                param.unit,
                param.getAvoidTypeString(),
                param.getTransitModeString(),
                param.isAlternatives,
                param.apiKey
            )
    }

    fun transportMode(transportMode: TransportMode): DirectionRequest {
        param.transportMode = transportMode
        return this
    }

    fun language(language: Language): DirectionRequest {
        param.language = language
        return this
    }

    fun unit(unit: Unit): DirectionRequest {
        param.unit = unit
        return this
    }

    fun avoid(avoid: AvoidType): DirectionRequest {
        if (!param.avoidTypes.contains(avoid)) {
            param.avoidTypes.add(avoid)
        }

        return this
    }

    fun transitMode(transitMode: TransitMode): DirectionRequest {
        if (!param.transitModes.contains(transitMode)) {
            param.transitModes.add(transitMode)
        }

        return this
    }

    fun alternativeRoute(alternative: Boolean): DirectionRequest {
        param.isAlternatives = alternative
        return this
    }

    fun departureTime(time: String): DirectionRequest {
        param.departureTime = time
        return this
    }

    fun optimizeWaypoints(optimize: Boolean): DirectionRequest {
        param.isOptimizeWaypoints = optimize
        return this
    }

}
