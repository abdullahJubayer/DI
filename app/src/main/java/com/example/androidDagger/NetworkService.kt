package com.example.androidDagger

import retrofit2.http.GET

interface NetworkService {

    @GET("params")
    fun getData():String
}