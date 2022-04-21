package com.example.merileague.ApiClinet_ApiInterfaces

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class ApiClient {
    companion object{

        var BaseUrl = "http://143.198.81.200"
         fun create() : Api_Interfaces {
             val retrofit = Retrofit.Builder()
                 .addConverterFactory(GsonConverterFactory.create())
                 .baseUrl(BaseUrl)
                 .build()
             return retrofit.create(Api_Interfaces::class.java)
         }
    }
}