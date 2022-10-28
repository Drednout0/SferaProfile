package com.bignerdranch.android.sferaprofile.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

import com.bignerdranch.android.sferaprofile.databinding.ListBinding

class AdapterMom : RecyclerView.Adapter<AdapterMom.MomentUserViewHolder>() {
    private var userList2 = listOf(1, 2, 3, 4, 5, 6)


    class MomentUserViewHolder(binding: ListBinding) : RecyclerView.ViewHolder(binding.root) {


    }


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AdapterMom.MomentUserViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ListBinding.inflate(layoutInflater, parent, false)
        return AdapterMom.MomentUserViewHolder(binding)


    }

    override fun onBindViewHolder(holder: AdapterMom.MomentUserViewHolder, position: Int) {


    }

    override fun getItemCount(): Int {
        return userList2.size
    }

}
