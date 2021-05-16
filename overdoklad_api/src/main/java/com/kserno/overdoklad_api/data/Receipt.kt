package com.kserno.overdoklad_api.data

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.android.parcel.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
data class Receipt(
    @Json(name = "receiptId") val receiptId : String,
    @Json(name = "ico") val ico : String,
    @Json(name = "cashRegisterCode") val cashRegisterCode : String,
    @Json(name = "issueDate") val issueDate : String,
    @Json(name = "createDate") val createDate : String,
    @Json(name = "customerId") val customerId : String?,
    @Json(name = "dic") val dic : String,
    @Json(name = "icDph") val icDph : String,
    @Json(name = "invoiceNumber") val invoiceNumber : String?,
    @Json(name = "okp") val okp : String,
    @Json(name = "paragon") val paragon : Boolean,
    @Json(name = "paragonNumber") val paragonNumber : String?,
    @Json(name = "pkp") val pkp : String,
    @Json(name = "receiptNumber") val receiptNumber : Int,
    @Json(name = "type") val type : String,
    @Json(name = "taxBaseBasic") val taxBaseBasic : Double,
    @Json(name = "taxBaseReduced") val taxBaseReduced : Double,
    @Json(name = "totalPrice") val totalPrice : Double,
    @Json(name = "freeTaxAmount") val freeTaxAmount : Double,
    @Json(name = "vatAmountBasic") val vatAmountBasic : Double,
    @Json(name = "vatAmountReduced") val vatAmountReduced : Double,
    @Json(name = "vatRateBasic") val vatRateBasic : Double,
    @Json(name = "vatRateReduced") val vatRateReduced : Double,
    @Json(name = "items") val items : List<Item>,
    @Json(name = "organization") val organization : Organization,
    @Json(name = "unit") val unit : Unit,
    @Json(name = "exemption") val exemption : Boolean
): Parcelable