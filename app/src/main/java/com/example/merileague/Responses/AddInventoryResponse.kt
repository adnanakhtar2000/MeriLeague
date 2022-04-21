package com.example.merileague.Responses

import com.google.gson.annotations.SerializedName

data class AddInventoryResponse(
     val status : Int,
  val data : Data_Inventory
)
data class Data_Inventory (

    @SerializedName("_id") val _id : String,
    @SerializedName("name") val name : String,
    @SerializedName("picture") val picture : String,
    @SerializedName("credits") val credits : String,
    @SerializedName("points") val points : String,
    @SerializedName("type") val type : String,
    @SerializedName("createdAt") val createdAt : String,
    @SerializedName("__v") val __v : Int
)