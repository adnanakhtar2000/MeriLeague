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

class UpcomingMy_Match_AdapterMatch_Adapter(val firstTeam_Flag: ArrayList<Int> ,val secondTeam_Flag: ArrayList<Int> ,val firstTeam_Name: ArrayList<String> ,val secondTeam_Name: ArrayList<String> ,val winPrizes: ArrayList<String>  ): RecyclerView.Adapter<UpcomingMy_Match_AdapterMatch_Viewholder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UpcomingMy_Match_AdapterMatch_Viewholder {
        val inflater : LayoutInflater = LayoutInflater.from(parent.context)
        val view : View = inflater.inflate(R.layout.mymatchesupcomming_layout , parent , false)
        return UpcomingMy_Match_AdapterMatch_Viewholder(view)
    }

    override fun onBindViewHolder(holder: UpcomingMy_Match_AdapterMatch_Viewholder, position: Int) {
     holder.firstTeam_Flag.setImageResource(firstTeam_Flag[position])
     holder.secondTeam_Flag.setImageResource(secondTeam_Flag[position])
     holder.firstTeam_Name.text = firstTeam_Name[position]
     holder.secondTeam_Name.text = secondTeam_Name[position]
        holder.winPrizes.text = winPrizes[position]

    }

    override fun getItemCount(): Int {
        return firstTeam_Flag.size
    }
}
class UpcomingMy_Match_AdapterMatch_Viewholder(itemview : View): RecyclerView.ViewHolder(itemview){

    val firstTeam_Flag = itemview.findViewById<CircleImageView>(R.id.first_teamFlag1)
    val secondTeam_Flag = itemview.findViewById<CircleImageView>(R.id.second_teamFlag1)
    val firstTeam_Name = itemview.findViewById<TextView>(R.id.first_teamName1)
    val secondTeam_Name = itemview.findViewById<TextView>(R.id.second_teamName1)
    val winPrizes = itemview.findViewById<TextView>(R.id.winPrizes)




}