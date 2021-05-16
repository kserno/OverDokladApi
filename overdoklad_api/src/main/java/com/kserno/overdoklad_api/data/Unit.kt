package com.kserno.overdoklad_api.data

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.android.parcel.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
data class Unit(
    @Json(name = "cashRegisterCode") val cashRegisterCode : String,
    @Json(name = "buildingNumber") val buildingNumber : String,
    @Json(name = "country") val country : String,
    @Json(name = "municipality") val municipality : String,
    @Json(name = "postalCode") val postalCode : String,
    @Json(name = "propertyRegistrationNumber") val propertyRegistrationNumber : String?,
    @Json(name = "streetName") val streetName : String,
    @Json(name = "name") val name : String?,
    @Json(name = "unitType") val unitType : String
): Parcelable