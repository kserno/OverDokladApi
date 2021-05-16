package com.kserno.overdoklad_api.data.request

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ReceiptFindRequest(
    @Json(name = "receiptId") val receiptId: String
)