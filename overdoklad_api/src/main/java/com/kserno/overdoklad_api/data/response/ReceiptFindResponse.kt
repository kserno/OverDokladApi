package com.kserno.overdoklad_api.data.response

import com.kserno.overdoklad_api.data.Receipt
import com.kserno.overdoklad_api.data.SearchIdentification
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ReceiptFindResponse(
    @Json(name = "returnValue") val returnValue : Int,
    @Json(name = "receipt") val receipt: Receipt?,
    @Json(name = "searchIdentification") val searchIdentification : SearchIdentification
)