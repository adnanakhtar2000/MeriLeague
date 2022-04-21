package com.example.merileague.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.merileague.R
import com.example.merileague.databinding.FragmentCricketSeriesBinding


class Cricket_Series : Fragment() {
    private lateinit var cricketSeriesBinding: FragmentCricketSeriesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        cricketSeriesBinding = FragmentCricketSeriesBinding.inflate(inflater, container , false)
        // Inflate the layout for this fragment
        return cricketSeriesBinding.root
    }


}