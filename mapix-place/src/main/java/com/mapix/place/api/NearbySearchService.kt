package com.mapix.place.api

import com.mapix.core.network.GoogleMapsApiUrls
import com.mapix.place.response.NearbyResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface NearbySearchService {
    @GET(GoogleMapsApiUrls.NEARBY_API_BASE_URL)
    fun getNearbyPlaces(
        @Query("location") location: String,
        @Query("radius") radius: Int,
        @Query("key") apiKey: String
    ): Single<NearbyResponse>
}