package com.example.airlineapp
import okhttp3.ConnectionPool
import okhttp3.OkHttpClient
import okhttp3.Protocol
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import retrofit2.http.GET
import java.util.concurrent.TimeUnit

interface apiInterface {
    @GET ("v1/airlines")

    fun getAirlines(): Call<List<Airlines>>

    companion object
    {
        var baseURL = "https://api.instantwebtools.net/"

        fun create(): apiInterface
        {
            val client = OkHttpClient.Builder().apply {
                connectionPool(ConnectionPool(0, 1, TimeUnit.NANOSECONDS))
                protocols(listOf(Protocol.HTTP_1_1))
                connectTimeout(60, TimeUnit.SECONDS)
                writeTimeout(60, TimeUnit.SECONDS)
                readTimeout(60, TimeUnit.SECONDS)
                retryOnConnectionFailure(false)
            }.build()
            val retrofit=Retrofit.Builder()
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(baseURL)
                .build()
            return retrofit.create(apiInterface::class.java)
        }

    }
}