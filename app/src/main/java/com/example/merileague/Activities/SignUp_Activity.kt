package com.example.merileague.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.merileague.R
import com.example.merileague.databinding.ActivitySignUpBinding

class SignUp_Activity : AppCompatActivity() {
    private lateinit var signUpBinding: ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        signUpBinding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(signUpBinding.root)
        val window = this.window
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        window.statusBarColor = this.resources.getColor(R.color.green)
        //Create Account Button
        signUpBinding.createAccount.setOnClickListener{
            val intent = Intent(this , Login_Activity::class.java)
            startActivity(intent)
        }
        // Login Button
        signUpBinding.loginButton.setOnClickListener{
            val intent = Intent(this , Dashboard::class.java)
            startActivity(intent)
        }

    }
}