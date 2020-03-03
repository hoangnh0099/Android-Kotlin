package com.example.exampleintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val intent: Intent = Intent(this@MainActivity, SecondActiviy::class.java)
            intent.putExtra("data", "Test value")
            startActivity(intent)
        }
    }
}
