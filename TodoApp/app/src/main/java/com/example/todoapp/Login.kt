package com.example.todoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity() {

    val auth = FirebaseAuth.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        loginButton.setOnClickListener {
            val email: String = emailInput.text.toString()
            val password: String = passwordInput.text.toString().trim()

            if (email != null && password != null) {
                auth.signInWithEmailAndPassword(email, password).addOnCompleteListener { task ->
                    if (task.isSuccessful) {
                        val user = auth.currentUser
                        val intent: Intent = Intent(this@Login, MainActivity::class.java)
                        startActivity(intent)
                    } else {
                        Toast.makeText(this@Login, "Login Failed! - ${task.exception}", Toast.LENGTH_SHORT).show()
                    }
                }
            } else {
                Toast.makeText(this@Login, "Email or password is empty", Toast.LENGTH_SHORT).show()
            }
        }
    }
}