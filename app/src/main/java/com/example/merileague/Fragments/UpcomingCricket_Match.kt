package com.example.merileague.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.merileague.R
import com.example.merileague.Recycler_Adapter.UpcomingMatch_Adapter
import com.example.merileague.databinding.FragmentUpcomingCricketMatchBinding


class UpcomingCricket_Match : Fragment() {
   private lateinit var upcomingCricketMatchBinding: FragmentUpcomingCricketMatchBinding
   val firstTeamFlag : ArrayList<Int> = arrayListOf(R.drawable.australia , R.drawable.england, R.drawable.pakistan,R.drawable.australia , R.drawable.england, R.drawable.pakistan,)
   val secondTeamFlag : ArrayList<Int> = arrayListOf(R.drawable.pakistan , R.drawable.india , R.drawable.england,R.drawable.pakistan , R.drawable.india , R.drawable.england,)
   val firstTeamName : ArrayList<String> = arrayListOf("AUS" , "ENG" , "PAK","AUS" , "ENG" , "PAK",)
   val secondTeamName : ArrayList<String> = arrayListOf("PAK", "IND", "ENG","PAK", "IND", "ENG",)
   val total_players : ArrayList<String> = arrayListOf("10K Players","14K Players","6K Players","10K Players","14K Players","6K Players",)
   val total_contests : ArrayList<String> = arrayListOf("10 Contests","15 Contests","8 Contests","10 Contests","15 Contests","8 Contests",)
   val total_sports : ArrayList<String> = arrayListOf("12K Sports","18K Sports","22K Sports","12K Sports","18K Sports","22K Sports",)
    private lateinit var upcomingmatchAdapter: UpcomingMatch_Adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        upcomingCricketMatchBinding = FragmentUpcomingCricketMatchBinding.inflate(inflater , container , false)
       upcomingCricketMatchBinding.upcomingMatchRecycler.adapter = UpcomingMatch_Adapter(firstTeamFlag , secondTeamFlag,firstTeamName ,secondTeamName,total_players,total_contests,total_sports)
        upcomingCricketMatchBinding.upcomingMatchRecycler.layoutManager = LinearLayoutManager(context , LinearLayoutManager.VERTICAL , false)
        return upcomingCricketMatchBinding.root
    }


}