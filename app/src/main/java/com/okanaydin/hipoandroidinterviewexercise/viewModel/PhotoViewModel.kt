package com.okanaydin.hipoandroidinterviewexercise.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.okanaydin.hipoandroidinterviewexercise.model.Photo
import com.okanaydin.hipoandroidinterviewexercise.model.Recent
import com.okanaydin.hipoandroidinterviewexercise.remote.RetrofitInstance
import com.okanaydin.hipoandroidinterviewexercise.util.API_KEY
import com.okanaydin.hipoandroidinterviewexercise.util.DEFAULT_FORMAT
import com.okanaydin.hipoandroidinterviewexercise.util.DEFAULT_PER_PAGE
import com.okanaydin.hipoandroidinterviewexercise.util.NO_JSON_CALLBACK
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PhotoViewModel : ViewModel() {

    val recentPhoto: MutableLiveData<List<Photo?>> = MutableLiveData()

    fun getRecentList(page: Int) {


        val api = RetrofitInstance.service
        val call = api.getRecentData(
            apiKey = API_KEY,
            format = DEFAULT_FORMAT,
            noJsonCallback = NO_JSON_CALLBACK,
            perPage = DEFAULT_PER_PAGE,
            page = page
        )

        call.enqueue(object : Callback<Recent> {
            override fun onFailure(call: Call<Recent>, t: Throwable) {
                recentPhoto.postValue(null)
            }

            override fun onResponse(call: Call<Recent>, response: Response<Recent>) {
                val photosList = response.body()?.photos?.photo
                photosList?.let {
                    recentPhoto.postValue(it)
                }
            }

        })


    }
}