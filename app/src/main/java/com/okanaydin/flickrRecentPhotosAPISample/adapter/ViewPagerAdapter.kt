package com.okanaydin.flickrRecentPhotosAPISample.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.okanaydin.flickrRecentPhotosAPISample.activity.RecentPhotoFragment
import com.okanaydin.flickrRecentPhotosAPISample.activity.SearchPhotoFragment

class ViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    private val recentFragment by lazy { RecentPhotoFragment.newInstance() }
    private val searchFragment by lazy { SearchPhotoFragment.newInstance() }

    private val fragmentList = ArrayList<Fragment>().apply {
        add(recentFragment)
        add(searchFragment)
    }

    private val fragmentTitleList = ArrayList<String>().apply {
        add("Recent Photos")
        add("Search Photo")
    }

    override fun getItem(position: Int): Fragment = fragmentList[position]

    override fun getCount(): Int = fragmentList.size

    override fun getPageTitle(position: Int): CharSequence? = fragmentTitleList[position]

}