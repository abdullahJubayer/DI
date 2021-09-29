package com.example.androidDagger

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Inject
import javax.inject.Singleton

@Module
class RemoteRetrofitModule @Inject constructor() {

    @Singleton
    @Provides
    fun getRetrofitService(): NetworkService {
        return Retrofit.Builder()
            .baseUrl("https://reqres.in/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(NetworkService::class.java)
    }

    @Provides
    fun getRetrofitServiceWithNewInstance(): NetworkService {
        return Retrofit.Builder()
            .baseUrl("https://reqres.in/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(NetworkService::class.java)
    }
}