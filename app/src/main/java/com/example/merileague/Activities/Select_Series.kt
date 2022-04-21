package com.example.merileague.Activities

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.merileague.Fragments.BasketBall_Series
import com.example.merileague.Fragments.Cricket_Series
import com.example.merileague.Fragments.Footbal_Series
import com.example.merileague.Fragments.Kabadai_Series
import com.example.merileague.R
import com.example.merileague.TabAdapters.Cricket_TabAdapter
import com.example.merileague.databinding.ActivitySelectSeriesBinding
import com.kofigyan.stateprogressbar.StateProgressBar


class Select_Series : AppCompatActivity() {
    private lateinit var selectSeriesBinding: ActivitySelectSeriesBinding
    var descriptionData = arrayOf("Select Series", "Select match", "Create Team", "Join Contest")
    lateinit var tabnumber : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        selectSeriesBinding = ActivitySelectSeriesBinding.inflate(layoutInflater)
        setContentView(selectSeriesBinding.root)
        val window = this.window
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        window.statusBarColor = this.resources.getColor(R.color.green)
        val stateProgressBar = findViewById<View>(R.id.your_state_progress_bar_id) as StateProgressBar
        stateProgressBar.setStateDescriptionData(descriptionData)

        val cricketTabadapter = Cricket_TabAdapter(supportFragmentManager)
      /*  if (selectSeriesBinding.selectmatchtab.getTabAt(selectSeriesBinding.selectmatchtab.selectedTabPosition) == ""){
            Toast.makeText(applicationContext , cricketTabadapter.count.toString() , Toast.LENGTH_LONG).show()

            stateProgressBar.setCurrentStateNumber(StateProgressBar.StateNumber.ONE);
        }
       else if (cricketTabadapter.count == 2){
            stateProgressBar.setCurrentStateNumber(StateProgressBar.StateNumber.TWO);
        }
       else if (cricketTabadapter.count == 3){
            stateProgressBar.setCurrentStateNumber(StateProgressBar.StateNumber.THREE);
        }
       else if (cricketTabadapter.count == 4){
            stateProgressBar.setCurrentStateNumber(StateProgressBar.StateNumber.FOUR);
        }
*/


        cricketTabadapter.setFragments(Cricket_Series() , "Cricket")
        cricketTabadapter.setFragments(Kabadai_Series() , "Kabadi")
        cricketTabadapter.setFragments(Footbal_Series() , "Football")
        cricketTabadapter.setFragments(BasketBall_Series() , "Basketball")
        selectSeriesBinding.seriesViewpager.adapter  = cricketTabadapter
        selectSeriesBinding.selectmatchtab.setupWithViewPager(selectSeriesBinding.seriesViewpager)



    }
}