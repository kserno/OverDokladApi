package com.kserno.overdoklad_api

import com.kserno.overdoklad_api.data.request.ReceiptFindRequest
import com.kserno.overdoklad_api.data.request.ReceiptReportRequest
import com.kserno.overdoklad_api.data.response.BaseResponse
import com.kserno.overdoklad_api.data.response.ReceiptFindResponse
import com.kserno.overdoklad_api.service.OverdokladService
import com.kserno.overdoklad_api.service.OverdokladServiceRx
import com.squareup.moshi.Moshi
import io.reactivex.rxjava3.core.Single
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory

class OverDokladApi {

    private val moshi = Moshi.Builder().build()
    private val client = OkHttpClient.Builder()
        .addInterceptor(HttpLoggingInterceptor().apply {
            if (BuildConfig.DEBUG) {
                level = HttpLoggingInterceptor.Level.BODY
            }
        })
        .build()

    private val service = Retrofit.Builder()
        .baseUrl(Constants.OVER_DOKLAD_API_URL)
        .addConverterFactory(MoshiConverterFactory.create(moshi))
        .client(client)
        .build()
        .create(OverdokladService::class.java)

    private val rxService = Retrofit.Builder()
        .baseUrl(Constants.OVER_DOKLAD_API_URL)
        .addConverterFactory(MoshiConverterFactory.create(moshi))
        .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
        .client(client)
        .build()
        .create(OverdokladServiceRx::class.java)


    fun find(receiptId: String, callback: Callback<ReceiptFindResponse>) {
        try {
            val response = service.findReceipt(ReceiptFindRequest(receiptId))

            if (response.isSuccessful && response.body() != null) {
                callback.onSuccess(response.body()!!)
            } else {
                callback.onError(response.code(), response.message())
            }

        } catch (e: Exception) {
            callback.onError(0, e.toString())
        }

    }

    fun report(request: ReceiptReportRequest, callback: Callback<BaseResponse>) {
        try {
            val response = service.reportReceipt(request)

            if (response.isSuccessful && response.body() != null) {
                callback.onSuccess(response.body()!!)
            } else {
                callback.onError(response.code(), response.message())
            }

        } catch (e: Exception) {
            callback.onError(0, e.toString())
        }

    }

    fun find(receiptId: String): Single<ReceiptFindResponse> {
       return rxService.findReceipt(ReceiptFindRequest(receiptId))
    }

    fun report(request: ReceiptReportRequest): Single<BaseResponse> {
        return rxService.reportReceipt(request)
    }

    interface Callback<T> {
        fun onSuccess(result: T)
        fun onError(code: Int, error: String)
    }

}