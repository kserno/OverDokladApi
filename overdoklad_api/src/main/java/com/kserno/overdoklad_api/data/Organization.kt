package com.kserno.overdoklad_api.data

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.android.parcel.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
data class Organization (
    @Json(name = "buildingNumber") val buildingNumber : String?,
    @Json(name = "country") val country : String,
    @Json(name = "dic") val dic : String,
    @Json(name = "icDph") val icDph : String,
    @Json(name = "ico") val ico : String,
    @Json(name = "municipality") val municipality : String,
    @Json(name = "name") val name : String?,
    @Json(name = "postalCode") val postalCode : String,
    @Json(name = "propertyRegistrationNumber") val propertyRegistrationNumber : String?,
    @Json(name = "streetName") val streetName : String,
    @Json(name = "vatPayer") val vatPayer : Boolean
): Parcelable