package com.example.merileague.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.merileague.R
import com.example.merileague.databinding.ActivityLoginBinding

class Login_Activity : AppCompatActivity() {
    private lateinit var loginBinding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loginBinding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(loginBinding.root)
        val window = this.window
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        window.statusBarColor = this.resources.getColor(R.color.white)
        // Login Signup Button
        loginBinding.loginSignup.setOnClickListener{
            val intent = Intent(this , SignUp_Activity::class.java)
            startActivity(intent)
        }
        // Signup Button
        loginBinding.signupButton.setOnClickListener{
            val intent = Intent(this , Dashboard::class.java)
            startActivity(intent)
        }
    }
}