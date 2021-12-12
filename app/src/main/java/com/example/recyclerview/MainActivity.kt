package com.example.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val persons = listOf(Person(R.drawable.ic_launcher_foreground, "Rizwan", "Ahwalwadi Road"), Person(R.drawable.ic_launcher_foreground, "Pallavi", "Bakori"))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val adapter = PersonListAdapter(persons)
        val adapter = PersonsAdapter()
        adapter.submitList(persons)
        binding.rvPerson.addItemDecoration(DividerItemDecoration(this, LinearLayoutManager.VERTICAL))
        binding.rvPerson.adapter = adapter
    }
}