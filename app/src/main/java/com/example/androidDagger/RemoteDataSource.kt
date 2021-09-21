package com.example.androidDagger

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RemoteDataSource @Inject constructor() {
    fun fetchData(): String {
        return "Hello From ${this.javaClass.canonicalName} Object Name:${this}"
//        return remoteRetrofitModule.getRetrofitService().getData()
    }
}