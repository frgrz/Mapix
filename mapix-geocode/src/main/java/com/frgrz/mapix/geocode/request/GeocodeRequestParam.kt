package com.frgrz.mapix.geocode.request

import com.frgrz.mapix.core.model.Bounds
import java.lang.StringBuilder
import java.util.*
import kotlin.collections.ArrayList

class GeocodeRequestParam(
    apiKey: String = "",
    address: String? = null,
    private var components: ArrayList<String> = arrayListOf()
) {
    var address: String? = address
        private set

    var apiKey: String = apiKey
        private set

    private var bounds: Bounds? = null

    var region: String? = null
        private set

    var language: String? = null
        private set

    fun setAddress(address: String) {
        this.address = address
    }

    fun setApiKey(apiKey: String): GeocodeRequestParam {
        this.apiKey = apiKey
        return this
    }

    fun setBounds(bounds: Bounds) {
        this.bounds = bounds
    }

    fun setLanguage(language: String) {
        this.language = language
    }

    fun setRegion(region: String) {
        this.region = region
    }

    fun addComponents(addressType: String, value: String) {
        components.add(addressType.toLowerCase(Locale.getDefault()) + ":" + value)
    }

    fun getComponents(): String? {
        return if (components.isEmpty()) {
            null
        } else {
            components.joinToString(separator = "|")
        }
    }

    fun getBounds(): String? {
        return if (bounds == null) {
            null
        } else {
            val sb = StringBuilder()
            sb.append(bounds!!.northEast)
            sb.append("|")
            sb.append(bounds!!.southWest)
            sb.toString()
        }
    }
}