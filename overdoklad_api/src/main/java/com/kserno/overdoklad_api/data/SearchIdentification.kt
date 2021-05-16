package com.kserno.overdoklad_api.data

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SearchIdentification(
    @Json(name = "createDate") val createDate : Long,
    @Json(name = "bucket") val bucket : Int,
    @Json(name = "internalReceiptId") val internalReceiptId : String,
    @Json(name = "searchUuid") val searchUuid : String
)