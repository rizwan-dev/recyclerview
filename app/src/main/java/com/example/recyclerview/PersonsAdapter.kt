package com.example.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil.ItemCallback
import androidx.recyclerview.widget.ListAdapter
import com.example.recyclerview.databinding.ItemPersonBinding

class PersonsAdapter : ListAdapter<Person, PersonListViewHolder>(DiffCallBack) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonListViewHolder {
        val binding = ItemPersonBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PersonListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PersonListViewHolder, position: Int) {
        val itemAtPosition = getItem(position)
        holder.bindData(itemAtPosition)
    }
}

val DiffCallBack = object : ItemCallback<Person>() {
    override fun areItemsTheSame(oldItem: Person, newItem: Person) = oldItem == newItem

    override fun areContentsTheSame(oldItem: Person, newItem: Person) =
        oldItem.imageResourceId == newItem.imageResourceId && oldItem.name == newItem.name
}