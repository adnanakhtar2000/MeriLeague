package com.example.merileague.ApiClinet_ApiInterfaces

import com.example.merileague.Responses.AddInventoryResponse
import com.example.merileague.Responses.BuyUserInventoryResponse
import com.example.merileague.Responses.LoginResponce
import com.example.merileague.Responses.SignupResponce
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.Header
import retrofit2.http.POST

interface Api_Interfaces {
    @FormUrlEncoded
    @POST("auth/signup")
    fun getRegisterResponce(
        @Field("email") email : String ,
        @Field("fullName") fullName : String,
        @Field("password") password : String ,
        @Field("phone") phone : String,
        @Field("userName") userName : String
    ): Call<SignupResponce>
    @FormUrlEncoded
    @POST("auth/login")
    fun getLoginResponce(
        @Field("password") password : String ,
        @Field("userName") userName : String

    ):Call<LoginResponce>


    @FormUrlEncoded
    @POST("transaction/getInventoryByType")
    fun getInventoryByType(
        @Header("Authorization") authorization: String?,
        @Field("type") type : String ,
    ):Call<AddInventoryResponse>

  @FormUrlEncoded
    @POST("transaction/buyUserInventory")
    fun buyUserInventory(
      @Header("Authorization") authorization: String?,
        @Field("userId") userId : String ,
        @Field("name") name : String ,
        @Field("picture") picture : String ,
        @Field("transactionId") transactionId : String ,
        @Field("points") points : String ,
        @Field("points") type : String ,
    ):Call<BuyUserInventoryResponse>

 @FormUrlEncoded
    @POST("transaction/getUserInventories/123123")
    fun getUserInventory(
     @Header("Authorization") authorization: String?

    ):Call<BuyUserInventoryResponse>


    @FormUrlEncoded
    @POST("transaction/addDebitTransaction")
    fun addDebitTransection(
        @Header("Authorization") authorization: String?,
        @Field("userId") userId : String ,
        @Field("date") date : String,
        @Field("description") description : String,
        @Field("amount") amount : String

    )

}