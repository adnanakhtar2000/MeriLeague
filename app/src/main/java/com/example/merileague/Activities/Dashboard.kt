package com.example.merileague.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.GravityCompat
import com.example.merileague.Fragments.Cricket_Fragment
import com.example.merileague.R
import com.example.merileague.databinding.ActivityDashboardBinding

class Dashboard : AppCompatActivity() {
    private lateinit var dashboardBinding: ActivityDashboardBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dashboardBinding = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(dashboardBinding.root)
        val window = this.window
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        window.statusBarColor = this.resources.getColor(R.color.green)
        dashboardBinding.dehaze.setOnClickListener {
            dashboardBinding.drawerLayout.openDrawer(GravityCompat.START)
            ///stat
        }
       supportFragmentManager.beginTransaction().add(R.id.dashboard_container , Cricket_Fragment()).commit()
        dashboardBinding.navigationView.setNavigationItemSelectedListener{
            when(it.itemId){
                R.id.left_myMatches -> {
                   val intent = Intent(applicationContext , My_Matches::class.java)
                    startActivity(intent)
                    overridePendingTransition(0,0)

                }
                R.id.left_wallet -> {
                    val intent = Intent(applicationContext , My_Wallet::class.java)
                    startActivity(intent)
                    overridePendingTransition(0,0)

                }
                R.id.left_myMatches -> {
                    val intent = Intent(applicationContext , My_Matches::class.java)
                    startActivity(intent)
                    overridePendingTransition(0,0)
                }
            }

            return@setNavigationItemSelectedListener true

        }
        dashboardBinding.bottomNav.setOnItemSelectedListener {
            when(it.itemId){
                R.id.bottom_matches -> {
                    val intent = Intent(applicationContext , My_Matches::class.java)
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                    startActivity(intent)
                    overridePendingTransition(0,0)

                }
                R.id.bottom_home -> {
                    val intent = Intent(applicationContext , Dashboard::class.java)
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                    startActivity(intent)
                    overridePendingTransition(0,0)

                }
        }
return@setOnItemSelectedListener true
    }
        
}}