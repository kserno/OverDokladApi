package com.kserno.overdoklad_api.data.response

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BaseResponse(
    @Json(name = "returnValue") val returnValue : Int
)