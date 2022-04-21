package com.example.merileague.Responses

import java.util.*

data class GetTournamentsResponse(val status : Int,  val data : List<GetTournamentData>)
data class GetTournamentData(
    val countries : List<Countries>,
    val formats : List<String>,
    val _id : String,
    val key : String,
    val __v : Int,
    val association_association_key : String,
    val competition : Competition,
    val gender : String,
    val is_date_confirmed : Boolean,
    val is_venue_confirmed : Boolean,
    val last_scheduled_match_date : String,
    val metric_group : String,
    val name : String,
    val point_system : String,
    val short_name : String,
    val sport : String,
    val start_date : String,
    val createdAt : String
)

data class Countries (
    val short_code : String,
    val code : String,
    val name : String,
    val official_name : String,
    val is_region : Boolean

)

data class Competition(
    val key : String,
    val code : String,
    val name : String
)




