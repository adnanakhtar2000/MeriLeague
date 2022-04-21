package com.example.merileague.Recycler_Adapter

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.merileague.R
import com.example.merileague.Responses.GetTournamentData
import de.hdodenhof.circleimageview.CircleImageView

class Cricket_series_Adapter(val getTournamentData: List<GetTournamentData>)/* RecyclerView.Adapter<League_History_viewholder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): League_History_viewholder {
        val inflater : LayoutInflater = LayoutInflater.from(parent.context)
        val view : View = inflater.inflate(R.layout.cricket_series , parent , false)
        return League_History_viewholder(view)
    }

    override fun onBindViewHolder(holder: League_History_viewholder, position: Int) {
     holder.league_name.text = getTournamentData[position].competition.code
     holder.total_matches.text = secondTeam_Flag[position]
     holder.start_date.text = firstTeam_Name[position]
     holder.end_date.text = secondTeam_Name[position]
        holder.winPrizes.text = winPrizes[position]


    }

    override fun getItemCount(): Int {
        return firstTeam_Flag.size
    }
}
class Cricket_series_Viewholder(itemview : View): RecyclerView.ViewHolder(itemview){

    val league_name = itemview.findViewById<TextView>(R.id.league_name)
    val total_matches = itemview.findViewById<TextView>(R.id.total_matches)
    val start_date = itemview.findViewById<TextView>(R.id.start_date)
    val end_date = itemview.findViewById<TextView>(R.id.end_date)
    val winPrizes = itemview.findViewById<TextView>(R.id.win_match_prize)


*/



