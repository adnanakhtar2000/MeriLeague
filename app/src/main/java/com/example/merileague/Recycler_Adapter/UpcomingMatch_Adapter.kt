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

class UpcomingMatch_Adapter(val firstTeam_Flag: ArrayList<Int> ,val secondTeam_Flag: ArrayList<Int> ,val firstTeam_Name: ArrayList<String> ,val secondTeam_Name: ArrayList<String> ,val total_players: ArrayList<String> ,val total_contests: ArrayList<String> ,val total_sports: ArrayList<String> , ): RecyclerView.Adapter<upcomingMatch_viewholder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): upcomingMatch_viewholder {
        val inflater : LayoutInflater = LayoutInflater.from(parent.context)
        val view : View = inflater.inflate(R.layout.matches_layout , parent , false)
        return upcomingMatch_viewholder(view)
    }

    override fun onBindViewHolder(holder: upcomingMatch_viewholder, position: Int) {
     holder.firstTeam_Flag.setImageResource(firstTeam_Flag[position])
     holder.secondTeam_Flag.setImageResource(secondTeam_Flag[position])
     holder.firstTeam_Name.text = firstTeam_Name[position]
     holder.secondTeam_Name.text = secondTeam_Name[position]
     holder.total_players.text = total_players[position]
     holder.total_contests.text = total_contests[position]
     holder.total_sports.text = total_sports[position]
    }

    override fun getItemCount(): Int {
        return firstTeam_Flag.size
    }
}
class upcomingMatch_viewholder(itemview : View): RecyclerView.ViewHolder(itemview){

    val firstTeam_Flag = itemview.findViewById<CircleImageView>(R.id.first_teamFlag)
    val secondTeam_Flag = itemview.findViewById<CircleImageView>(R.id.second_teamFlag)
    val firstTeam_Name = itemview.findViewById<TextView>(R.id.first_teamName)
    val secondTeam_Name = itemview.findViewById<TextView>(R.id.second_teamName)
    val total_players = itemview.findViewById<TextView>(R.id.total_players)
    val total_contests = itemview.findViewById<TextView>(R.id.total_contests)
    val total_sports = itemview.findViewById<TextView>(R.id.total_sports)



}