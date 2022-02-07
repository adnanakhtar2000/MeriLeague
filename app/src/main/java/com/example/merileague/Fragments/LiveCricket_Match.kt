package com.example.merileague.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.merileague.R
import com.example.merileague.databinding.FragmentLiveCricketMatchBinding


class LiveCricket_Match : Fragment() {

    private lateinit var liveCricketMatchBinding: FragmentLiveCricketMatchBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        liveCricketMatchBinding  = FragmentLiveCricketMatchBinding.inflate(inflater , container , false)
        // Inflate the layout for this fragment
        return liveCricketMatchBinding.root
    }


}