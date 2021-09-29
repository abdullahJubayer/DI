package com.example.androidDagger.login

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.androidDagger.RemoteRetrofitModule
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class RemoteLogin @Inject constructor(private val remoteRetrofitModule: RemoteRetrofitModule) {
    fun login(userLiveData: MutableLiveData<User>): String {
        remoteRetrofitModule.getRetrofitService().getData(6).enqueue(object : Callback<User>{
            override fun onResponse(call: Call<User>, response: Response<User>) {
                Log.e("TAG", "onSuccess" )
                userLiveData.value=response.body()
            }

            override fun onFailure(call: Call<User>, t: Throwable) {
                Log.e("TAG", "onFailure: "+t.message )
            }
        })
        return "Remote Login Success"
    }
}