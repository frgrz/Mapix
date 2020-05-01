package com.mapix.direction

import com.mapix.direction.api.DirectionApi
import com.mapix.direction.request.DirectionOriginRequest

object RxDirection {

    fun withConnection(connection: DirectionApi): DirectionOriginRequest {
        return DirectionOriginRequest(connection)
    }

}
