package com.example.recyclerview

import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.ItemPersonBinding

class PersonListViewHolder(private val binding: ItemPersonBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bindData(person: Person) {
        with(binding) {
            ivPerson.setImageResource(person.imageResourceId)
            tvName.text = person.name
            tvAddress.text = person.address
        }
    }
}