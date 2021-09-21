package com.example.androidDagger

import javax.inject.Inject

class RemoteDataSource @Inject constructor(private val remoteRetrofitModule: RemoteRetrofitModule) {
    fun fetchData(): String {
        //return "Hello From ${this.javaClass.canonicalName}"
        return remoteRetrofitModule.getRetrofitService().getData()
    }
}