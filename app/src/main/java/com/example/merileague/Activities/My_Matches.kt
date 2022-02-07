package com.example.merileague.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.merileague.Fragments.LiveCricket_Match
import com.example.merileague.Fragments.ResultsCricket_Match
import com.example.merileague.Fragments.UpcomingCricket_Match
import com.example.merileague.MyMAtchesFragment.Completed_Matches
import com.example.merileague.MyMAtchesFragment.Live_Matches
import com.example.merileague.MyMAtchesFragment.Upcoming_Matches
import com.example.merileague.R
import com.example.merileague.TabAdapters.Cricket_TabAdapter
import com.example.merileague.databinding.ActivityMyMatchesBinding

class My_Matches : AppCompatActivity() {
    private lateinit var myMatchesBinding: ActivityMyMatchesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        myMatchesBinding = ActivityMyMatchesBinding.inflate(layoutInflater)
        setContentView(myMatchesBinding.root)
        val window = this.window
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        window.statusBarColor = this.resources.getColor(R.color.green)
        myMatchesBinding.backarrow.setOnClickListener{
            finish()
        }
        val cricketTabadapter = Cricket_TabAdapter(supportFragmentManager)
        cricketTabadapter.setFragments(Upcoming_Matches() , "Upcoming")
        cricketTabadapter.setFragments(Live_Matches() , "Live")
        cricketTabadapter.setFragments(Completed_Matches() , "Completed")
        myMatchesBinding.myMatchesViewpager.adapter  = cricketTabadapter
        myMatchesBinding.myMatchesTab.setupWithViewPager(myMatchesBinding.myMatchesViewpager)

    }
}