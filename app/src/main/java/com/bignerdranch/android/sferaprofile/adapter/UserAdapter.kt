package com.bignerdranch.android.sferaprofile.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bignerdranch.android.sferaprofile.databinding.ListBinding


class UserAdapter : RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    private var userList = listOf(1, 2, 3, 4)
    class UserViewHolder(binding: ListBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ListBinding.inflate(layoutInflater, parent, false)
        return UserViewHolder(binding)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
    }

    override fun getItemCount(): Int {
        return userList.size
    }
}