package com.okanaydin.flickrRecentPhotosAPISample.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.okanaydin.flickrRecentPhotosAPISample.R
import com.okanaydin.flickrRecentPhotosAPISample.adapter.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), TabLayout.BaseOnTabSelectedListener<TabLayout.Tab>, ViewPager.OnPageChangeListener {
    override fun onTabReselected(p0: TabLayout.Tab?) {
        Log.v("TAG", "onTabReselected")
    }

    override fun onTabUnselected(p0: TabLayout.Tab?) {
        Log.v("TAG", "onTabReselected")
    }

    override fun onTabSelected(p0: TabLayout.Tab?) {
        Log.v("TAG", "onTabReselected")
    }

    override fun onPageScrollStateChanged(state: Int) {
        Log.v("TAG", "onTabReselected")
    }

    override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
        Log.v("TAG", "onTabReselected")
    }

    override fun onPageSelected(position: Int) {
        Log.v("TAG", "onTabReselected")
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        viewPager.adapter = ViewPagerAdapter(supportFragmentManager)

        tabLayout.setupWithViewPager(viewPager)

        viewPager.currentItem = 0

        tabLayout.addOnTabSelectedListener(this)

        viewPager.addOnPageChangeListener(this)



        }
}
