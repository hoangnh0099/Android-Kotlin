package com.example.todoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity() {

    private val auth = FirebaseAuth.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Login
        loginButton.setOnClickListener {
            val email: String = emailInput.text.toString().trim()
            val password: String = passwordInput.text.toString().trim()

            if (email.isNotEmpty() && password.isNotEmpty()) {
                auth.signInWithEmailAndPassword(email, password).addOnCompleteListener { task ->
                    if (task.isSuccessful) {
                        val user = auth.currentUser
                        val intent: Intent = Intent(this@Login, TodoList::class.java)
                        startActivity(intent)
                    } else {
                        Toast.makeText(this@Login, "Login Failed! - ${task.exception}", Toast.LENGTH_SHORT).show()
                    }
                }
            } else {
                Toast.makeText(this, "Email or passwor is not empty", Toast.LENGTH_SHORT).show()
            }
        }

        // Register
        registerButton.setOnClickListener {
            val intent: Intent = Intent(this@Login, Register::class.java)
            startActivity(intent)
        }

        // Forgot Password
        forgotPasswordButton.setOnClickListener {
            val intent: Intent = Intent(this@Login, ForgotPassword::class.java)
            startActivity(intent)
        }
    }
}