package com.example.merileague.Responses

import com.google.gson.annotations.SerializedName

data class GetSingleMatchResponses(val status : Int , val data : ArrayList<SingleMatchData>)
data   class SingleMatchData(

    val messages : List<String>,
    val notes : List<String>,
    val data_review : String,
    val squad : String,
    val umpires : String,
    val matchStatus : String,
    val _id : String,
    val key : String,
    val __v : Int,
    val association : SingleMAtchAssociation,
    val completed_date_approximate : String,
    val estimated_end_date : String,
    val format : String,
    val gender : String,
    val metric_group : String,
    val name : String,
    val play : SingleMAtchPlay,
    val play_status : String,
    val players : Players,
    val short_name : String,
    val sport : String,
    val start_at : String,
    val start_at_local : String,
    val status : String,
    val teams : Teams,
    val title : String,
    val toss : Toss,
    val tournament : Tournament,
    val venue : Venue,
    val winner : String,
    val createdAt : String
)

data class SingleMAtchAssociation (

    val key : String,
    val code : String,
    val name : String,
    val country : String,
    val parent : String
)

data class SingleMAtchPlay (

    val first_batting : String,
    val day_number : Int,
    val overs_per_innings : List<Int>,
    val reduced_overs : String,
    val target : Target,
    val result : Result,
    val innings_order : List<String>,
    val innings : Innings,
    val live : String
)

data class Target (

    val balls : Int,
    val runs : Int,
    val dl_applied : Boolean
)
data class Result (

    val pom : List<String>,
    val winner : String,
    val result_type : String,
    val msg : String
)
data class Innings (

    val b_1 : B_1,
    val a_1 : A_1
)
data class B_1 (

    val index : String,
    val overs : List<Int>,
    val is_completed : Boolean,
    val score_str : String,
    val score : Score,
    val wickets : Int,
    val extra_runs : Extra_runs,
    val balls_breakup : Balls_breakup
)
data class Score (

    val runs : Int,
    val balls : Int,
    val fours : Int,
    val sixes : Int,
    val dot_balls : Int,
    val run_rate : Float
)
data class Extra_runs (

    val extra : Int,
    val bye : Int,
    val leg_bye : Int,
    val wide : Int,
    val no_ball : Int,
    val penalty : String
)
data class Balls_breakup (

    val dot_balls : Int,
    val wides : Int,
    val no_balls : Int,
    val fours : Int,
    val sixes : Int
)

data class A_1 (

    val index : String,
    val overs : List<Int>,
    val is_completed : Boolean,
    val score_str : String,
    val score : A_Score,
    val wickets : Int,
    val extra_runs : A_Extra_runs,
    val balls_breakup : A_Balls_breakup
)

data class A_Score (

    val runs : Int,
    val balls : Int,
    val fours : Int,
    val sixes : Int,
    val dot_balls : Int,
    val run_rate : Float
)
data class A_Extra_runs (

    val extra : Int,
    val bye : Int,
    val leg_bye : Int,
    val wide : Int,
    val no_ball : Int,
    val penalty : String
)
data class A_Balls_breakup (

    val dot_balls : Int,
    val wides : Int,
    val no_balls : Int,
    val fours : Int,
    val sixes : Int
)
data class Players (

    val ba_king : Ba_king,
    val u_qadir : Ba_king,
    val an_phillip : Ba_king,
    val r_shepherd : Ba_king,
    val b_azam : Ba_king,
    val g_motie : Ba_king,
    val kh_shah : Ba_king,
    val ro_chase : Ba_king,
    val as_ali : Ba_king,
    val k_mayers : Ba_king,
    val a_hosein : Ba_king,
    val dom_drakes : Ba_king,
    val c__player__shahnawaz_dahani__f9496 : Ba_king,
    val f_zaman : Ba_king,
    val s_cotterrell : Ba_king,
    val c__player__mohammad_wasim_jr__85c80 : Ba_king,
    val d_thomas : Ba_king,
    val sh_brooks : Ba_king,
    val of_smith : Ba_king,
    val ift_ahmed : Ba_king,
    val dr_bravo : Ba_king,
    val n_pooran : Ba_king,
    val al_joseph : Ba_king,
    val m_rizwan : Ba_king,
    val hayd_walsh : Ba_king,
    val ro_powell : Ba_king,
    val m_hasnain : Ba_king,
    val j_greaves : Ba_king,
    val se_afridi : Ba_king,
    val r_reifer : Ba_king,
    val sha_khan : Ba_king,
    val har_rauf : Ba_king,
    val c__player__haider_ali__d59bd : Ba_king,
    val moh_nawaz : Ba_king,
    val s_hope : Ba_king,
    val os_thomas : Ba_king
)
data class Ba_king (

    val player : Player,
    val score : Score
)

data class Player (
    val key : String,
    val name : String,
    val jersey_name : String,
    val legal_name : String,
    val gender : String,
    val nationality : Nationality,
    val date_of_birth : String,
    val seasonal_role : String,
    val roles : List<String>,
    val batting_style : String,
    val bowling_style : Bowling_style,
    val skills : List<String>,
    val score : Player_Score
)
data class Nationality (
    val short_code : String,
    val code : String,
    val name : String,
    val official_name : String,
    val is_region : Boolean
)

data class Bowling_style (
    val arm : String,
    val pace : String,
    val bowling_type : String
)

data class Player_Score (
    @SerializedName("1") val player1 : Plaeyer_1
        )

data class Plaeyer_1 (

    val batting : Batting,
    val bowling : Bowling,
    val fielding : Fielding
)

data class Batting (

    val score : Batter_Score,
    val dismissal : String,
    val team_runs : Int,
    val wicket_number : Int,
    val msg : String,
    val ball_key : String,
)
data class Bowling (

    val score : Bowler_Score
)
data class Fielding (

    val catches : Int,
    val stumpings : Int,
    val runouts : Int
)

data class Batter_Score (

    val runs : Int,
    val balls : Int,
    val fours : Int,
    val sixes : Int,
    val dot_balls : Int,
    val run_rate : Float
)

data class Bowler_Score (

    val balls : Int,
    val runs : Int,
    val economy : Float,
    val extras : Int,
    val wickets : Int,
    val maiden_overs : Int,
    val overs : List<String>,
    val balls_breakup : Balls_breakup
)


data class Teams (

    val a : A,
    val b : A
)
data class A (

    val key : String,
    val code : String,
    val name : String
)

data class Toss (

    val called : String,
    val winner : String,
    val elected : String
)

data class Tournament (

    val key : String,
    val name : String,
    val short_name : String
)

data class Venue (

    val key : String,
    val name : String,
    val city : String,
    val country : Country
)
data class Country (

    val short_code : String,
    val code : String,
    val name : String,
    val official_name : String,
    val is_region : Boolean
)