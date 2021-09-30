package com.example.androidDagger.simple_injection_with_module

import androidx.lifecycle.MutableLiveData
import com.example.androidDagger.NetworkConnectivityStatus
import com.example.androidDagger.singleton.User
import javax.inject.Inject

class Repository @Inject constructor(
    private val localDataSource: LocalDataSource,
    private val remoteDataSource: RemoteDataSource,
    private val networkConnectivityStatus: NetworkConnectivityStatus
) {
    fun fetchData(userLiveData: MutableLiveData<User>) {
        if (networkConnectivityStatus.isNetworkConnected())
            remoteDataSource.fetchData(userLiveData)
        localDataSource.fetchData(userLiveData)
    }
}