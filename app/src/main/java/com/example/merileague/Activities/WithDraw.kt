package com.example.merileague.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.merileague.Fragments.*
import com.example.merileague.R
import com.example.merileague.TabAdapters.Cricket_TabAdapter
import com.example.merileague.databinding.ActivityWithDrawBinding

class WithDraw : AppCompatActivity() {
    private lateinit var withDrawBinding: ActivityWithDrawBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        withDrawBinding = ActivityWithDrawBinding.inflate(layoutInflater)
        setContentView(withDrawBinding.root)
        val window = this.window
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        window.statusBarColor = this.resources.getColor(R.color.green)
        val cricketTabadapter = Cricket_TabAdapter(supportFragmentManager)
        cricketTabadapter.setFragments(New_Withdraw() , "New Withdraw")
        cricketTabadapter.setFragments(AllWithdraw_Request() , "All Withdraw Request")

        withDrawBinding.withViewpager.adapter  = cricketTabadapter
        withDrawBinding.withdrawTab.setupWithViewPager(withDrawBinding.withViewpager)

        withDrawBinding.backarrow.setOnClickListener{
            finish()
        }
    }
}