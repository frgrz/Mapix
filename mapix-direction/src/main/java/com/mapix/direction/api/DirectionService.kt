package com.mapix.direction.api

import com.mapix.core.model.Language
import com.mapix.core.model.TransportMode
import com.mapix.core.network.GoogleMapsApiUrls
import com.mapix.direction.response.DirectionResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface DirectionService {

    @GET(GoogleMapsApiUrls.DIRECTION_API_JSON_URL)
    fun getDirection(
        @Query("origin") origin: String, // Mandatory
        @Query("destination") destination: String, // Mandatory
        @Query("waypoints") waypoints: String?,
        @Query("mode") transportMode: TransportMode?,
        @Query("departure_time") departureTime: String?,
        @Query("language") language: Language?,
        @Query("units") units: Unit?,
        @Query("avoid") avoid: String?,
        @Query("transit_mode") transitMode: String?, 
        @Query("alternatives") alternatives: Boolean?,
        @Query("key") apiKey: String // Mandatory
    ): Single<DirectionResponse>

}
