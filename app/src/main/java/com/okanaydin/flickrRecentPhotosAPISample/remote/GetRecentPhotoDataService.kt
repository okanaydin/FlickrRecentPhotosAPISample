package com.okanaydin.flickrRecentPhotosAPISample.remote

import com.okanaydin.flickrRecentPhotosAPISample.model.Recent
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface GetRecentPhotoDataService {

    @GET("?method=flickr.photos.getRecent")
    fun getRecentData(
        @Query("api_key") apiKey: String,
        @Query("format") format: String,
        @Query("nojsoncallback") noJsonCallback: Int,
        @Query("per_page") perPage: Int,
        @Query("page") page: Int
    ): Call<Recent>

}