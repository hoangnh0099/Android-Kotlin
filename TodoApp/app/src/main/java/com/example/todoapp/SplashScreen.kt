package com.example.todoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

class SplashScreen : AppCompatActivity() {
    private val auth: FirebaseAuth = FirebaseAuth.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
    }

    override fun onStart() {
        super.onStart()

        val currentUser = auth.currentUser

        if (currentUser != null) {
            val intent: Intent = Intent(this@SplashScreen, TodoList::class.java)
            startActivity(intent)
        } else {
            val intent: Intent = Intent(this@SplashScreen, Login::class.java)
            startActivity(intent)
        }
    }
}