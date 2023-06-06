package com.example.traveleco.data

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("{orderId}/status")
    fun getOrderDetail(
        @Path("orderId") orderId: String
    ): Call<List<PaymentResponse>>

    @GET("{orderId}/status")
    fun getMerchant(
        @Path("orderId") orderId: String
    ): Call<List<VaNumbersItem>>
}