package com.example.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.ItemPersonBinding

class PersonListAdapter(private val persons: List<Person>) :
    RecyclerView.Adapter<PersonListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonListViewHolder {
        val binding = ItemPersonBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PersonListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PersonListViewHolder, position: Int) {
        val itemAtPosition = persons[position]
        holder.bindData(itemAtPosition)
    }

    override fun getItemCount(): Int {
        return persons.size
    }
}