package com.frgrz.mapix.core.network

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class GoogleMapsApiConnection(
    okHttpClient: OkHttpClient
) {

    val instance: Retrofit = Retrofit.Builder()
        .client(okHttpClient)
        .baseUrl(GoogleMapsApiUrls.GOOGLE_MAPS_BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .build()

}
