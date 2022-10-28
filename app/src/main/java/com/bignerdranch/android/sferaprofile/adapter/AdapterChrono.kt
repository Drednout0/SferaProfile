package com.bignerdranch.android.sferaprofile.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bignerdranch.android.sferaprofile.databinding.List3Binding
import com.bignerdranch.android.sferaprofile.databinding.ListBinding


class AdapterChrono : RecyclerView.Adapter<AdapterChrono.ChronoUserViewHolder>() {
    private var userList3 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)


    class ChronoUserViewHolder(binding: List3Binding) : RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChronoUserViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = List3Binding.inflate(layoutInflater, parent, false)
        return ChronoUserViewHolder(binding)


    }

    override fun onBindViewHolder(holder: AdapterChrono.ChronoUserViewHolder, position: Int) {
    }

    override fun getItemCount(): Int {
        return userList3.size
    }

}