package com.okanaydin.flickrRecentPhotosAPISample.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.okanaydin.flickrRecentPhotosAPISample.model.Photo

class RecentPhotoAdapter(
    private var photoList: List<Photo?>,
    private val onItemClickListener: (Photo?) -> Unit
) : RecyclerView.Adapter<RecentViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecentViewHolder = RecentViewHolder(parent)

    override fun getItemCount(): Int = photoList.size

    override fun onBindViewHolder(holder: RecentViewHolder, position: Int) {

        holder.bind(photoList[position]!!, onItemClickListener)

    }

    fun setPhotoList(photoList: List<Photo?>) {
        this.photoList = photoList
        this.notifyDataSetChanged()
    }
}