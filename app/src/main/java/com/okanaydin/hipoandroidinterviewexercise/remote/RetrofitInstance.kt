package com.okanaydin.hipoandroidinterviewexercise.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object RetrofitInstance {

    private const val BASE_URL = "https://api.flickr.com/services/rest/?method="

    var service: RetrofitInstance

    init {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        service = retrofit.create(RetrofitInstance::class.java)

    }
}



