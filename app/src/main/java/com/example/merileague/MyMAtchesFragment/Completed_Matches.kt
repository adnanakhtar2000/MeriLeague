package com.example.merileague.MyMAtchesFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.merileague.R
import com.example.merileague.Recycler_Adapter.CompletedMy_Match_Adapter
import com.example.merileague.Recycler_Adapter.UpcomingMy_Match_AdapterMatch_Adapter
import com.example.merileague.databinding.FragmentCompletedMatchesBinding


class Completed_Matches : Fragment() {
  private lateinit var completedMatchesBinding: FragmentCompletedMatchesBinding
    val firstTeamFlag : ArrayList<Int> = arrayListOf(R.drawable.australia , R.drawable.england, R.drawable.pakistan,R.drawable.australia , R.drawable.england, R.drawable.pakistan,)
    val secondTeamFlag : ArrayList<Int> = arrayListOf(R.drawable.pakistan , R.drawable.india , R.drawable.england,R.drawable.pakistan , R.drawable.india , R.drawable.england,)
    val firstTeamName : ArrayList<String> = arrayListOf("AUS" , "ENG" , "PAK","AUS" , "ENG" , "PAK",)
    val secondTeamName : ArrayList<String> = arrayListOf("PAK", "IND", "ENG","PAK", "IND", "ENG",)
    val winPrizes : ArrayList<String> = arrayListOf("10,0000","14,0000","600000","10,000","1400000","6,000000",)
    val yourRAnk : ArrayList<String> = arrayListOf("Your Rank : 10","Your Rank : 13","Your Rank : 1","Your Rank : 56","Your Rank : 198","4",)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        completedMatchesBinding = FragmentCompletedMatchesBinding.inflate(inflater , container , false)
        // Inflate the layout for this fragment
        completedMatchesBinding.completedMyMatchRecycler.adapter = CompletedMy_Match_Adapter(firstTeamFlag , secondTeamFlag,firstTeamName ,secondTeamName,winPrizes, yourRAnk)
        completedMatchesBinding.completedMyMatchRecycler.layoutManager = LinearLayoutManager(context , LinearLayoutManager.VERTICAL , false)

        return completedMatchesBinding.root
    }


}