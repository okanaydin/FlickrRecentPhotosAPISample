package com.okanaydin.hipoandroidinterviewexercise.activity


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.okanaydin.hipoandroidinterviewexercise.R


class SearchPhotoFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_search_photo, container, false)
    }
    companion object {
        @JvmStatic
        fun newInstance() = SearchPhotoFragment()
    }
}