package com.example.androidDagger

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
class RemoteRetrofitModule {

    @Provides
    fun getRetrofitService(): NetworkService {
        return Retrofit.Builder()
            .baseUrl("https://stackoverflow.com/")
            .build()
            .create(NetworkService::class.java)
    }
}