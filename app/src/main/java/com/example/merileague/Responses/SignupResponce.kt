package com.example.merileague.Responses

data class SignupResponce(var data: SignupData)
data class SignupData(var _id : String , var email : String , var userName : String , var type : String , var phone : String , var token : String)

