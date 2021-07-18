package com.everis.bootcamp.threading

import com.google.gson.annotations.SerializedName

data class AstrosResult(
    @SerializedName("people") val people: List<AstrosPeople>,
    @SerializedName("number") val number: Int,
    @SerializedName("message") val message: String

)