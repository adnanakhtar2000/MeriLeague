package com.example.merileague.Responses

data class CreateContestsResponse(
    val status : Int,
    val data : List<CreateContestsData>
)

data class CreateContestsData(
    val winner : List<String>,
    val type : String,
    val invitations : List<String>,
    val _id : String,
    val name : String,
    val prize : String,
    val entry : String,
    val teamLimit : Int,
    val spotsLeft : Int,
    val userId : String,
    val matchId : String,
    val tournmentId : String,
    val createdAt : String,
    val __v : Int
)
