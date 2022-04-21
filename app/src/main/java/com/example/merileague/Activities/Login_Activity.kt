package com.example.merileague.Activities

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.util.Patterns
import android.view.View
import android.widget.Toast
import retrofit2.Call;
import androidx.appcompat.app.AppCompatActivity
import com.example.merileague.ApiClinet_ApiInterfaces.ApiClient
import com.example.merileague.ApiClinet_ApiInterfaces.Api_Interfaces
import com.example.merileague.R
import com.example.merileague.Responses.SignupData
import com.example.merileague.Responses.SignupResponce
import com.example.merileague.databinding.ActivityLoginBinding
import retrofit2.Callback
import retrofit2.Response

class Login_Activity : AppCompatActivity() {
    private lateinit var loginBinding: ActivityLoginBinding
    private lateinit var apiInterfaces: Api_Interfaces
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loginBinding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(loginBinding.root)
        val window = this.window
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        window.statusBarColor = this.resources.getColor(R.color.white)
        // Login Signup Button
        apiInterfaces = ApiClient.create()
        loginBinding.loginSignup.setOnClickListener{
            val intent = Intent(this , SignUp_Activity::class.java)
            startActivity(intent)
        }
        // Signup Button
        loginBinding.signupButton.setOnClickListener{
            if (IsValid()){
                val call = apiInterfaces.getRegisterResponce(loginBinding.email.text.toString() , loginBinding.fullName.text.toString(), loginBinding.password.text.toString() , loginBinding.phone.text.toString() , loginBinding.userName.text.toString())
                 call.enqueue(object : Callback<SignupResponce>{
                     override fun onResponse(
                         call: Call<SignupResponce>,
                         response: Response<SignupResponce>
                     ) {
                       if (response.body() != null){
                           val intent = Intent(applicationContext , Dashboard::class.java)
                           startActivity(intent)
                       }
                         else{
                             Toast.makeText(applicationContext , response.message() + response.code() , Toast.LENGTH_LONG).show()
                       }
                     }

                     override fun onFailure(call: Call<SignupResponce>, t: Throwable) {
                         Toast.makeText(applicationContext , t.message , Toast.LENGTH_LONG).show()
                     }

                 })
            }

        }
    }
    private fun IsValid(): Boolean {

        if (loginBinding.fullName.text.toString().trim().length < 5) {
            Toast.makeText(applicationContext, "Please Enter Valid Full Name", Toast.LENGTH_SHORT).show()
            return false
        }
        if (loginBinding.userName.text.toString().trim().length < 1) {
            Toast.makeText(applicationContext, "Please Enter Valid User Name", Toast.LENGTH_SHORT).show()
            return false
        }
        if (loginBinding.password.text.toString().trim().length < 8) {
            Toast.makeText(applicationContext, "Please Enter at least 8 character for Password", Toast.LENGTH_SHORT).show()
            return false
        }
        if (loginBinding.phone.text.toString().trim().length < 10) {
            Toast.makeText(applicationContext, "Please Enter Valid Phone Number", Toast.LENGTH_SHORT).show()
            return false
        }

        if (TextUtils.isEmpty(loginBinding.email.text.toString()) || !Patterns.EMAIL_ADDRESS.matcher(loginBinding.email.text.toString()).matches()) {
            Toast.makeText(applicationContext, "Please Enter valid Email Address", Toast.LENGTH_SHORT).show()
            return false
        }

        return true
    }


}