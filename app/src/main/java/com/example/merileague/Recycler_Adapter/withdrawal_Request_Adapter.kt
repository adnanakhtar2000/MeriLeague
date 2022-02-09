package com.example.merileague.Recycler_Adapter

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.merileague.R
import de.hdodenhof.circleimageview.CircleImageView

class withdrawal_Request_Adapter(val firstTeam_Flag: ArrayList<String> ,val secondTeam_Flag: ArrayList<String> ,val firstTeam_Name: ArrayList<String>  ): RecyclerView.Adapter<withdrawal_Request_viewholder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): withdrawal_Request_viewholder {
        val inflater : LayoutInflater = LayoutInflater.from(parent.context)
        val view : View = inflater.inflate(R.layout.withdrawal_requests , parent , false)
        return withdrawal_Request_viewholder(view)
    }

    override fun onBindViewHolder(holder: withdrawal_Request_viewholder, position: Int) {
     holder.withdrawal_balance.text = firstTeam_Flag[position]
     holder.wirhdrawl_date.text = secondTeam_Flag[position]
     holder.wirhdrawl_status.text = firstTeam_Name[position]



    }

    override fun getItemCount(): Int {
        return firstTeam_Flag.size
    }
}
class withdrawal_Request_viewholder(itemview : View): RecyclerView.ViewHolder(itemview){

    val withdrawal_balance = itemview.findViewById<TextView>(R.id.withdrawal_balance)
    val wirhdrawl_date = itemview.findViewById<TextView>(R.id.wirhdrawl_date)
    val wirhdrawl_status = itemview.findViewById<TextView>(R.id.wirhdrawl_status)






}