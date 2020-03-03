package com.example.calculateone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        plusButton.setOnClickListener {
            val firstNumber: Int = (firstNumber.text.toString()).toInt()
            val secondNumber: Int = (secondNumber.text.toString()).toInt()

            val result: Int = firstNumber + secondNumber

            resultView.text = result.toString()
        }

        subButton.setOnClickListener {
            val firstNumber: Int = (firstNumber.text.toString()).toInt()
            val secondNumber: Int = (secondNumber.text.toString()).toInt()

            val result: Int = firstNumber - secondNumber

            resultView.text = result.toString()
        }

        mulButton.setOnClickListener {
            val firstNumber: Int = (firstNumber.text.toString()).toInt()
            val secondNumber: Int = (secondNumber.text.toString()).toInt()

            val result: Int = firstNumber * secondNumber

            resultView.text = result.toString()
        }

        divButton.setOnClickListener {
            val firstNumber: Int = (firstNumber.text.toString()).toInt()
            val secondNumber: Int = (secondNumber.text.toString()).toInt()

            val result: Int = firstNumber / secondNumber

            resultView.text = result.toString()
        }
    }
}
