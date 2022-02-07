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
        }
       supportFragmentManager.beginTransaction().add(R.id.dashboard_container , Cricket_Fragment()).commit()
        dashboardBinding.navigationView.setNavigationItemSelectedListener{
            when(it.itemId){
                R.id.left_myMatches -> {
                   val intent = Intent(applicationContext , My_Matches::class.java)
                    startActivity(intent)

                }
            }
            dashboardBinding.drawerLayout.closeDrawer(GravityCompat.START)
            return@setNavigationItemSelectedListener true

        }

    }
}