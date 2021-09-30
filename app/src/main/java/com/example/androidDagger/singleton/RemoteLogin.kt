package com.example.androidDagger.singleton

import android.util.Log
import androidx.lifecycle.MutableLiveData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RemoteLogin @Inject constructor(private val remoteRetrofitModule: RemoteRetrofitModule) {
    fun login(userLiveData: MutableLiveData<User>,page:Int) {
        val source=remoteRetrofitModule.getRetrofitService()
        source.getData(page).enqueue(object : Callback<User>{
            override fun onResponse(call: Call<User>, response: Response<User>) {
                userLiveData.value=response.body()
            }

            override fun onFailure(call: Call<User>, t: Throwable) {
                Log.e("TAG", "onFailure: "+t.message )
            }
        })
    }
}