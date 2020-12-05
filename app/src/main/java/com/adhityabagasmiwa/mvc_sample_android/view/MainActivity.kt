package com.adhityabagasmiwa.mvc_sample_android.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.adhityabagasmiwa.mvc_sample_android.R
import com.adhityabagasmiwa.mvc_sample_android.controller.StudentListAdapter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showRecyclerview()
    }

    private fun showRecyclerview() {
        var rv_item_row_data = findViewById<RecyclerView>(R.id.item_row_data)

        var adapter = StudentListAdapter(this)
        adapter.getStudent()
        rv_item_row_data.adapter = adapter
        rv_item_row_data.setHasFixedSize(true)
        rv_item_row_data.layoutManager = LinearLayoutManager(this)
    }
}