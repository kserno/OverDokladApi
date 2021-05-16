package com.kserno.overdoklad_api.data

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.android.parcel.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
data class Item(
    @Json(name = "name") val name : String,
    @Json(name = "itemType") val itemType : String,
    @Json(name = "quantity") val quantity : Double,
    @Json(name = "vatRate") val vatRate : Double,
    @Json(name = "price") val price : Double
): Parcelable