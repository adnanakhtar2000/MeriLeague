package com.example.merileague.Responses

data class BuyUserInventoryResponse(val status : Int,
                                    val data : BuyInventoryData)
data class BuyInventoryData (

    val isAvailable : Boolean,
    val _id : String,
    val userId : Int,
    val name : String,
    val picture : String,
    val transactionId : Int,
    val points : Int,
    val type : String,
    val createdAt : String,
    val __v : Int
)
