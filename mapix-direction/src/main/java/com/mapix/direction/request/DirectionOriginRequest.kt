package com.mapix.direction.request

import androidx.annotation.VisibleForTesting
import com.mapix.core.model.Coordinate
import com.mapix.direction.api.DirectionApi

class DirectionOriginRequest(
    @VisibleForTesting
    private val connection: DirectionApi
) {

    fun from(origin: Coordinate): DirectionDestinationRequest {
        return DirectionDestinationRequest(connection, origin)
    }

}
