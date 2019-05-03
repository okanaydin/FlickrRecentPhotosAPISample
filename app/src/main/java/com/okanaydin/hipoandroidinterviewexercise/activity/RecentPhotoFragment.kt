package com.okanaydin.hipoandroidinterviewexercise.activity


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager

import com.okanaydin.hipoandroidinterviewexercise.R
import com.okanaydin.hipoandroidinterviewexercise.adapter.RecentPhotoAdapter
import kotlinx.android.synthetic.main.fragment_recent_photo.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class RecentPhotoFragment : Fragment() {

  //  val recentPhotoAdapter = RecentPhotoAdapter()

    /*
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        with(recylerView_recentPhotoList) {


            adapter = recentPhotoAdapter
            layoutManager = GridLayoutManager(context,2)
        }
        // recentPhotoAdapter.setPhotoList()
    }

    */

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_recent_photo, container, false)
    }


    companion object {
        @JvmStatic
        fun newInstance() = RecentPhotoFragment()
    }
}