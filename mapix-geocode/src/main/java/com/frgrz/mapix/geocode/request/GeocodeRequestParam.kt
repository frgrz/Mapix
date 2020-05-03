package com.frgrz.mapix.geocode.request

import com.frgrz.mapix.core.model.Bounds
import com.frgrz.mapix.core.model.Language
import java.lang.StringBuilder
import java.util.*
import kotlin.collections.ArrayList

class GeocodeRequestParam(
    var apiKey: String,
    var address: String? = null,
    var components: ArrayList<String> = arrayListOf(),
    var bounds: Bounds? = null,
    var region: String? = null,
    var language: Language? = null
) {

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