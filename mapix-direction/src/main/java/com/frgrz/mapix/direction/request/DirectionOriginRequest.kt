package com.frgrz.mapix.direction.request

import androidx.annotation.VisibleForTesting
import com.frgrz.mapix.core.model.Coordinate
import com.frgrz.mapix.direction.api.DirectionApi

class DirectionOriginRequest(
    @VisibleForTesting
    private val connection: DirectionApi
) {

    fun from(origin: Coordinate): DirectionDestinationRequest {
        return DirectionDestinationRequest(connection, origin)
    }

}
