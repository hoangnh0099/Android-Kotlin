package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val subjects: List<String> = listOf("iOS", "Android", "React Native", "Flutter")
        listView.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, subjects)
    }
}
