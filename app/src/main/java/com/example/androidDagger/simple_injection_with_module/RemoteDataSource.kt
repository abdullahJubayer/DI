package com.example.androidDagger.simple_injection_with_module

import androidx.lifecycle.MutableLiveData
import com.example.androidDagger.singleton.User
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSource @Inject constructor(private val remoteRetrofitModule: RemoteRetrofitModule) {
    fun fetchData(userLiveData: MutableLiveData<User>) {
        remoteRetrofitModule.getRetrofitService().getData(6).enqueue(object :Callback<User>{
            override fun onResponse(call: Call<User>, response: Response<User>) {
                userLiveData.value=response.body()
            }

            override fun onFailure(call: Call<User>, t: Throwable) {
                userLiveData.value=User(0,0,0,0,null,null)
            }

        })
    }
}