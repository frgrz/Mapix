package com.frgrz.mapix.geocode.api

import com.frgrz.mapix.core.model.Language
import com.frgrz.mapix.core.network.GoogleMapsApiUrls
import com.frgrz.mapix.geocode.response.GeocodeResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface GeocodeApiService {
    @GET(GoogleMapsApiUrls.GEOCODE_API_JSON_URL)
    fun geocode(
        @Query("address") address: String?,
        @Query("components") components: String?,
        @Query("language") language: Language?,
        @Query("region") region: String?,
        @Query("bounds") bounds: String?,
        @Query("key") key: String
    ): Single<GeocodeResponse>

    @GET(GoogleMapsApiUrls.GEOCODE_API_JSON_URL)
    fun reverseGeocodeWithPlaceId(
        @Query("place_id") placeId: String?,
        @Query("language") language: Language?,
        @Query("location_type") locationTypes: String?,
        @Query("result_type") resultType: String?,
        @Query("key") key: String
    ): Single<GeocodeResponse>

    @GET(GoogleMapsApiUrls.GEOCODE_API_JSON_URL)
    fun reverseGeocodeWithCoordinates(
        @Query("latlng") coordinate: String?,
        @Query("language") language: Language?,
        @Query("location_type") locationTypes: String?,
        @Query("result_type") resultType: String?,
        @Query("key") key: String
    ): Single<GeocodeResponse>

}
