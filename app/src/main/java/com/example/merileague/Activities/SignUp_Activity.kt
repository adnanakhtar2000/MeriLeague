package com.example.merileague.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Patterns
import android.view.View
import android.widget.Toast
import com.example.merileague.ApiClinet_ApiInterfaces.ApiClient
import com.example.merileague.ApiClinet_ApiInterfaces.Api_Interfaces
import com.example.merileague.R
import com.example.merileague.Responses.LoginResponce
import com.example.merileague.Responses.SignupResponce
import com.example.merileague.databinding.ActivitySignUpBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SignUp_Activity : AppCompatActivity() {
    private lateinit var signUpBinding: ActivitySignUpBinding
    private lateinit var apiInterfaces: Api_Interfaces
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        signUpBinding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(signUpBinding.root)
        val window = this.window
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        window.statusBarColor = this.resources.getColor(R.color.green)
        //Create Account Button
        apiInterfaces = ApiClient.create()
        signUpBinding.createAccount.setOnClickListener{
            val intent = Intent(this , Login_Activity::class.java)
            startActivity(intent)
        }
        // Login Button
        signUpBinding.loginButton.setOnClickListener{
            if (IsValid()){
                val call = apiInterfaces.getLoginResponce(signUpBinding.emailLogin.text.toString() , signUpBinding.passwordLogin.text.toString())
                call.enqueue(object : Callback<LoginResponce> {
                    override fun onResponse(
                        call: Call<LoginResponce>,
                        response: Response<LoginResponce>
                    ) {
                        if (response.body() != null){
                            val intent = Intent(applicationContext , Dashboard::class.java)
                            startActivity(intent)
                        }
                        else{
                            Toast.makeText(applicationContext , response.message() + " " + response.code() + response.errorBody().toString() , Toast.LENGTH_LONG).show()
                        }
                    }

                    override fun onFailure(call: Call<LoginResponce>, t: Throwable) {
                        Toast.makeText(applicationContext , t.message , Toast.LENGTH_LONG).show()
                    }

                })
            }
        }

    }

    private fun IsValid(): Boolean {


        if (signUpBinding.passwordLogin.text.toString().trim().length < 8) {
            Toast.makeText(applicationContext, "Please Enter at least 8 character for Password", Toast.LENGTH_SHORT).show()
            return false
        }
        if (signUpBinding.emailLogin.text.toString().trim().length < 1) {
            Toast.makeText(applicationContext, "Please Enter at least 8 character for Password", Toast.LENGTH_SHORT).show()
            return false
        }




        return true
    }

}