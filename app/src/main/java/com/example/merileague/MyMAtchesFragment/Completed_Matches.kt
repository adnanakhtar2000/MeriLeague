package com.example.merileague.MyMAtchesFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.merileague.R
import com.example.merileague.databinding.FragmentCompletedMatchesBinding


class Completed_Matches : Fragment() {
  private lateinit var completedMatchesBinding: FragmentCompletedMatchesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        completedMatchesBinding = FragmentCompletedMatchesBinding.inflate(inflater , container , false)
        // Inflate the layout for this fragment
        return completedMatchesBinding.root
    }


}