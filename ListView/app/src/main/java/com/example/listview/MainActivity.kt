package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val food: ArrayList<Menu> = ArrayList()
        food.add(Menu("Phở", R.drawable.ic_launcher_foreground))
        food.add(Menu("Bún", R.drawable.ic_launcher_foreground))
        food.add(Menu("Mỳ tôm", R.drawable.ic_launcher_foreground))
        food.add(Menu("Cơm", R.drawable.ic_launcher_foreground))
        food.add(Menu("Phở", R.drawable.ic_launcher_foreground))
        food.add(Menu("Bún", R.drawable.ic_launcher_foreground))
        food.add(Menu("Mỳ tôm", R.drawable.ic_launcher_foreground))
        food.add(Menu("Cơm", R.drawable.ic_launcher_foreground))
        food.add(Menu("Phở", R.drawable.ic_launcher_foreground))
        food.add(Menu("Bún", R.drawable.ic_launcher_foreground))
        food.add(Menu("Mỳ tôm", R.drawable.ic_launcher_foreground))
        food.add(Menu("Cơm", R.drawable.ic_launcher_foreground))

        listView.adapter = CustomAdapter(this@MainActivity, food)
    }
}
