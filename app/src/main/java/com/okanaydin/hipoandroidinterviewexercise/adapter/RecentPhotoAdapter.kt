package com.okanaydin.hipoandroidinterviewexercise.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.okanaydin.hipoandroidinterviewexercise.model.Photo

class RecentPhotoAdapter : RecyclerView.Adapter<RecentViewHolder>() {

    private var photoList: List<Photo?> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecentViewHolder = RecentViewHolder(parent)

    override fun getItemCount(): Int = photoList.size

    override fun onBindViewHolder(holder: RecentViewHolder, position: Int) {
        photoList[position]?.let { holder.bind(it) }
    }

    fun setPhotoList(photoList: List<Photo?>) {
        this.photoList = photoList
        this.notifyDataSetChanged()
    }
}