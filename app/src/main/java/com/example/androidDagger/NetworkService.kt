package com.example.androidDagger

import com.example.androidDagger.singleton.User
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface NetworkService {

    @GET("api/users")
    fun getData(@Query("page") page:Int):Call<User>
}