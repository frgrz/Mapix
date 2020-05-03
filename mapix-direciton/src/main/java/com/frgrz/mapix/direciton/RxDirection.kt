package com.frgrz.mapix.direction

import com.frgrz.mapix.direction.api.DirectionApi
import com.frgrz.mapix.direction.request.DirectionOriginRequest

object RxDirection {

    fun withConnection(connection: DirectionApi): DirectionOriginRequest {
        return DirectionOriginRequest(connection)
    }

}
