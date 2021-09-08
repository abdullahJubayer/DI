package com.example.androidDagger

import javax.inject.Inject

class Repository @Inject constructor(private val localDataSource: LocalDataSource,private val remoteDataSource: RemoteDataSource,private val networkConnectivityStatus: NetworkConnectivityStatus) {
    fun fetchData(): String {
        if (networkConnectivityStatus.isNetworkConnected())
            return remoteDataSource.fetchData()
        return localDataSource.fetchData()
    }
}