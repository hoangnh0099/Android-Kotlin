package com.example.todoapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_todo_list.*

class TodoList : AppCompatActivity() {

    private var auth: FirebaseAuth = FirebaseAuth.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_todo_list)

        logOutButton.setOnClickListener {
            auth.signOut()
            val intent: Intent = Intent(this@TodoList, MainActivity::class.java)
            startActivity(intent)
        }
    }
}