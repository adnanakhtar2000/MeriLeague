package com.example.merileague.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.merileague.R
import com.example.merileague.TabAdapters.Cricket_TabAdapter
import com.example.merileague.databinding.FragmentCricketBinding


class Cricket_Fragment : Fragment() {
    private lateinit var cricketBinding: FragmentCricketBinding
    private lateinit var cricketTabadapter: Cricket_TabAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        cricketBinding  = FragmentCricketBinding.inflate(inflater , container , false)
        val cricketTabadapter = Cricket_TabAdapter(childFragmentManager)
        cricketTabadapter.setFragments(UpcomingCricket_Match() , "Upcoming")
        cricketTabadapter.setFragments(LiveCricket_Match() , "Live")
        cricketTabadapter.setFragments(ResultsCricket_Match() , "Results")
        cricketBinding.cricketViewpager.adapter  = cricketTabadapter
        cricketBinding.cricketTab.setupWithViewPager(cricketBinding.cricketViewpager)
        return cricketBinding.root
    }


}