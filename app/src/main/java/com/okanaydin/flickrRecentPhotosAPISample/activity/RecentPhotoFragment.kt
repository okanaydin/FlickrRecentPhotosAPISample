package com.okanaydin.flickrRecentPhotosAPISample.activity


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import com.google.android.material.snackbar.Snackbar
import com.okanaydin.flickrRecentPhotosAPISample.R
import com.okanaydin.flickrRecentPhotosAPISample.adapter.RecentPhotoAdapter
import com.okanaydin.flickrRecentPhotosAPISample.model.Photo
import com.okanaydin.flickrRecentPhotosAPISample.viewModel.PhotoViewModel
import kotlinx.android.synthetic.main.fragment_recent_photo.*


class RecentPhotoFragment : Fragment() {

    private lateinit var viewModel: PhotoViewModel
    private lateinit var recentPhotoAdapter: RecentPhotoAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_recent_photo, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        viewModel = ViewModelProviders.of(this).get(PhotoViewModel::class.java)

        recentPhotoAdapter = RecentPhotoAdapter(mutableListOf()) {

            Toast.makeText(activity, it!!.getPhotoUrl(), Toast.LENGTH_SHORT).show()
        }

        recylerView_recentPhotoList.apply {
            layoutManager = GridLayoutManager(context, 2)
            adapter = recentPhotoAdapter
        }

        initLiveData()
        viewModel.getRecentList(1)

    }


    private fun initLiveData() {
        viewModel.recentPhoto.observe(this,
            Observer<List<Photo?>> { list ->
                if (list != null) {
                    recentPhotoAdapter.setPhotoList(list)
                } else {
                    view?.let {
                        Snackbar.make(
                            it,
                            "Connection Failed!",
                            Snackbar.LENGTH_SHORT
                        ).show()
                    }
                }
            })
    }


    companion object {
        @JvmStatic
        fun newInstance() = RecentPhotoFragment()
    }
}
