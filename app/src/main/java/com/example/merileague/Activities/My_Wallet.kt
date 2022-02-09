package com.example.merileague.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.merileague.R
import com.example.merileague.Recycler_Adapter.CompletedMy_Match_Adapter
import com.example.merileague.Recycler_Adapter.League_History_Adapter
import com.example.merileague.databinding.ActivityMyWalletBinding

class My_Wallet : AppCompatActivity() {
    private  lateinit var myWalletBinding: ActivityMyWalletBinding
    val firstTeamFlag : ArrayList<String> = arrayListOf("PSL" , "IPL" , "BPL", "BB")
    val secondTeamFlag : ArrayList<String> = arrayListOf("20" , "30", "14" ,"15")
    val firstTeamName : ArrayList<String> = arrayListOf("12 / 27 / 2021" , "12 / 27 / 2021" , "12 / 27 / 2021", "12 / 27 / 2021",)
    val secondTeamName : ArrayList<String> = arrayListOf( "12 / 27 / 2021","12 / 27 / 2021", "12 / 27 / 2021", "12 / 27 / 2021",)
    val winPrizes : ArrayList<String> = arrayListOf("10,0 Rs","14,00 RS","6000 RS","100 RS")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        myWalletBinding = ActivityMyWalletBinding.inflate(layoutInflater)
        setContentView(myWalletBinding.root)
        val window = this.window
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        window.statusBarColor = this.resources.getColor(R.color.green)
        myWalletBinding.LeagueHistoryRecycler.adapter = League_History_Adapter(firstTeamFlag , secondTeamFlag,firstTeamName ,secondTeamName,winPrizes)
        myWalletBinding.LeagueHistoryRecycler.layoutManager = LinearLayoutManager(this , LinearLayoutManager.VERTICAL , false)
        // Button ClickListner
        myWalletBinding.withdrawMoney.setOnClickListener{
            val intent = Intent(this , WithDraw::class.java)
            startActivity(intent)
            overridePendingTransition(0,0)
        }
        myWalletBinding.backarrow.setOnClickListener{
            finish()
        }

    }
}