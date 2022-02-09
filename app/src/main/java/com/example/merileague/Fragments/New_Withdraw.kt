package com.example.merileague.Fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.merileague.R
import com.example.merileague.databinding.FragmentNewWithdrawBinding


class New_Withdraw : Fragment() {
    private lateinit var newWithdrawBinding: FragmentNewWithdrawBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        newWithdrawBinding = FragmentNewWithdrawBinding.inflate(inflater , container , false)
        // Inflate the layout for this fragment
        newWithdrawBinding.withdrawButton.setOnClickListener{
            val intent = Intent(requireContext() , AllWithdraw_Request::class.java)
            startActivity(intent)
        }
        return newWithdrawBinding.root
    }


}