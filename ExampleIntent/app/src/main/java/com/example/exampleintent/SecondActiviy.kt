package com.example.exampleintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second_activiy.*

class SecondActiviy : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_activiy)

        val intent: Intent = intent
        val hoTen: String = intent.getStringExtra("data")
        textView.text = hoTen
    }
}
