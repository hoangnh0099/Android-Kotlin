package com.example.todoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_forgot_password.*

class ForgotPassword : AppCompatActivity() {
    private val auth: FirebaseAuth = FirebaseAuth.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        sendNewPasswordButton.setOnClickListener {
            val email: String = emailInput.text.toString()

            if (email.isNotEmpty()) {
                auth.sendPasswordResetEmail(email).addOnCompleteListener { task ->
                    if (task.isSuccessful) {
                        Toast.makeText(this, "Send successful!", Toast.LENGTH_SHORT).show()
                        val intent: Intent = Intent(this@ForgotPassword, Login::class.java)
                        startActivity(intent)
                    } else {
                        Toast.makeText(this, "Send failed! ${task.exception}", Toast.LENGTH_SHORT).show()
                    }
                }
            } else {
                Toast.makeText(this, "Email is not empty", Toast.LENGTH_SHORT).show()
            }
        }
    }
}