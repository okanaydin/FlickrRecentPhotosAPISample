package com.okanaydin.flickrRecentPhotosAPISample.activity


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.okanaydin.flickrRecentPhotosAPISample.R


class SearchPhotoFragment : Fragment() {

// TODO SearchPhotoFragment

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_search_photo, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance() = SearchPhotoFragment()
    }
}
