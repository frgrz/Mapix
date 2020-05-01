package com.mapix.place.request

import com.mapix.core.model.Coordinate

class NearbySearchRequestParam(
    center: Coordinate,
    radius: Int
) {
    var apiKey: String = ""
        private set

    private var center: Coordinate = center

    var radius: Int = radius
        private set

    fun setCenter(center: Coordinate) {
        this.center = center
    }

    fun setRadius(radius: Int) {
        this.radius = radius
    }

    fun setApiKey(apiKey: String): NearbySearchRequestParam {
        this.apiKey = apiKey
        return this
    }

    fun getCenter(): String {
        val sb = StringBuilder()
        sb.append(center.latitude)
        sb.append(",")
        sb.append(center.longitude)
        return sb.toString()
    }
}