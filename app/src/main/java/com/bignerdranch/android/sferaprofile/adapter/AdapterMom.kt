package com.bignerdranch.android.sferaprofile.adapter

import android.media.Image
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bignerdranch.android.sferaprofile.data.ImageModel
import com.bignerdranch.android.sferaprofile.databinding.List2Binding

import com.bignerdranch.android.sferaprofile.data.PeopleData
import java.nio.file.Files.size

class AdapterMom(val imageList: MutableList<ImageModel>) :
    RecyclerView.Adapter<AdapterMom.MomentUserViewHolder>() {
    class MomentUserViewHolder(binding: List2Binding) : RecyclerView.ViewHolder(binding.root) {}

    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int
    ): MomentUserViewHolder {
        Log.d("aaa", "message")
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = List2Binding.inflate(layoutInflater, parent, false)
        return MomentUserViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AdapterMom.MomentUserViewHolder, position: Int) {
    }

    override fun getItemCount(): Int {
        return imageList.size
    }

}
