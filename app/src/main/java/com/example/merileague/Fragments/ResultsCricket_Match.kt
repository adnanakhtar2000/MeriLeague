package com.example.merileague.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.merileague.R
import com.example.merileague.databinding.FragmentResultsCricketMatchBinding


class ResultsCricket_Match : Fragment() {
  private lateinit var  resultsCricketMatchBinding: FragmentResultsCricketMatchBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        resultsCricketMatchBinding = FragmentResultsCricketMatchBinding.inflate(inflater , container , false)
        // Inflate the layout for this fragment
        return resultsCricketMatchBinding.root
    }

}