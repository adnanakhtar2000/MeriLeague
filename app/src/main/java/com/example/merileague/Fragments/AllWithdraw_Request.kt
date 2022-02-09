package com.example.merileague.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.merileague.R
import com.example.merileague.Recycler_Adapter.CompletedMy_Match_Adapter
import com.example.merileague.Recycler_Adapter.withdrawal_Request_Adapter
import com.example.merileague.databinding.FragmentAllWithdrawRequestBinding


class AllWithdraw_Request : Fragment() {
    private lateinit var allWithdrawRequestBinding: FragmentAllWithdrawRequestBinding
    val firstTeamName : ArrayList<String> = arrayListOf("990" , "1010" , "2000","700" , "1100" , "10000",)
    val secondTeamName : ArrayList<String> = arrayListOf("12 / 27 / 2021", "12 / 47 / 2021", "12 / 47 / 2021","12 / 27 / 4021", "42 / 27 / 2021", "12 / 27 / 2021",)
    val winPrizes : ArrayList<String> = arrayListOf("Pending","Completed","Pending","Completed","Pending","Completed",)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        allWithdrawRequestBinding = FragmentAllWithdrawRequestBinding.inflate(inflater , container , false)
        // Inflate the layout for this fragment
        allWithdrawRequestBinding.withdrawalRequestRecycler.adapter = withdrawal_Request_Adapter(firstTeamName ,secondTeamName,winPrizes)
        allWithdrawRequestBinding.withdrawalRequestRecycler.layoutManager = LinearLayoutManager(context , LinearLayoutManager.VERTICAL , false)

        return allWithdrawRequestBinding.root
    }

}