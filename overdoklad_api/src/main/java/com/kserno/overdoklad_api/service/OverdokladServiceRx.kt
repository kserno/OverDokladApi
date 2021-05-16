package com.kserno.overdoklad_api.service

import com.kserno.overdoklad_api.data.request.ReceiptFindRequest
import com.kserno.overdoklad_api.data.request.ReceiptReportRequest
import com.kserno.overdoklad_api.data.response.BaseResponse
import com.kserno.overdoklad_api.data.response.ReceiptFindResponse
import io.reactivex.rxjava3.core.Single
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface OverdokladServiceRx {


    @POST("search/set")
    fun reportReceipt(@Body request: ReceiptReportRequest): Single<BaseResponse>


    @POST("receipt/find")
    fun findReceipt(@Body request: ReceiptFindRequest): Single<ReceiptFindResponse>

}