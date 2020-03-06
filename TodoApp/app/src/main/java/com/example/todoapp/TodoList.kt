package com.example.todoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_todo_list.*

class TodoList : AppCompatActivity() {
    private val auth: FirebaseAuth = FirebaseAuth.getInstance()
    private val currentUser = FirebaseAuth.getInstance().currentUser


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_todo_list)

        logoutButton.setOnClickListener {
            auth.signOut()
            val intent: Intent = Intent(this@TodoList, Login::class.java)
            startActivity(intent)
        }
    }
}