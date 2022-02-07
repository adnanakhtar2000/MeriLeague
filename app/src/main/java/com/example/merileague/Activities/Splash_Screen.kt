package com.example.merileague.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.example.merileague.R
import com.example.merileague.databinding.ActivitySplashScreenBinding

class Splash_Screen : AppCompatActivity() {
    private lateinit var splashScreenBinding: ActivitySplashScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        splashScreenBinding  = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(splashScreenBinding.root)
        val window = this.window
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        window.statusBarColor = this.resources.getColor(R.color.blue_full)
        Handler().postDelayed({
            val intent = Intent(this, SignUp_Activity::class.java);
            startActivity(intent);
            finish();
        }, 3000)
    }
}