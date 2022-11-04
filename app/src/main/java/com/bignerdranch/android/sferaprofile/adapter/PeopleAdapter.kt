package com.bignerdranch.android.sferaprofile.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bignerdranch.android.sferaprofile.R
import com.bignerdranch.android.sferaprofile.data.PeopleData
import com.bignerdranch.android.sferaprofile.databinding.PeopleListBinding
import com.bumptech.glide.Glide

class PeopleAdapter(private val context: Context) :
    RecyclerView.Adapter<PeopleAdapter.PeopleViewHolder>() {
    class PeopleViewHolder(val binding: PeopleListBinding) :
        RecyclerView.ViewHolder(binding.root)

    private val diffCallback = object : DiffUtil.ItemCallback<PeopleData>() {
        override fun areItemsTheSame(oldItem: PeopleData, newItem: PeopleData): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: PeopleData, newItem: PeopleData): Boolean {
            return oldItem.hashCode() == newItem.hashCode()
        }
    }

    private val differ = AsyncListDiffer(this, diffCallback)

    var peopleList: List<PeopleData>
        get() = differ.currentList
        set(value) = differ.submitList(value)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PeopleViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = PeopleListBinding.inflate(inflater, parent, false)
        return PeopleViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PeopleViewHolder, position: Int) {
        val people = peopleList[position]
        with(holder.binding) {
            userName.text = people.Name
            if (people.Subscribe) {
                subscribe.text = context.resources.getText(R.string.subscribe)
                subscribe.setTextColor(context.resources.getColor(R.color.purple_200))
            } else {
                subscribe.text = context.resources.getText(R.string.unsubsribe)
                subscribe.setTextColor(context.resources.getColor(R.color.grey))
            }

            Glide.with(context)
                .load(people.photoUrl)
                .centerCrop()
                .into(userImage)

            subscribe.setOnClickListener {
                onItemClickListener?.let { click ->
                    click(position)
                }
            }
        }
    }

    private var onItemClickListener: ((Int) -> Unit)? = null

    fun setOnItemClickListener(listener: (Int) -> Unit) {
        onItemClickListener = listener
    }

    override fun getItemCount(): Int {
        return peopleList.size
    }
}