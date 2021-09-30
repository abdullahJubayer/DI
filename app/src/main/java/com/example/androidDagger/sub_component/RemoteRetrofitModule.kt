package com.example.androidDagger.sub_component

import com.example.androidDagger.NetworkService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Inject

@Module
class RemoteRetrofitModule @Inject constructor() {
    @Provides
    fun getRetrofitService(): NetworkService {
        return Retrofit.Builder()
            .baseUrl("https://reqres.in/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(NetworkService::class.java)
    }
}