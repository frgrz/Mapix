package com.frgrz.mapix.core.model

import com.google.gson.annotations.SerializedName

class PlusCode(
    @SerializedName("compound_code") val compoundCode: String,
    @SerializedName("global_code") val globalCode: String
)