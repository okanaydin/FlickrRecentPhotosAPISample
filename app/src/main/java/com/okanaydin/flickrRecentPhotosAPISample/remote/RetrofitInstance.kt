package com.okanaydin.flickrRecentPhotosAPISample.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object RetrofitInstance {

    private const val BASE_URL = "https://api.flickr.com/services/rest/"

    var service: GetRecentPhotoDataService

    init {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        service = retrofit.create(GetRecentPhotoDataService::class.java)

    }
}



