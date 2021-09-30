package com.example.androidDagger.singleton

import androidx.lifecycle.MutableLiveData
import com.example.androidDagger.NetworkConnectivityStatus
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Repository @Inject constructor(
    private val localLogin: LocalLogin,
    private val remoteLogin: RemoteLogin,
    private val networkConnectivityStatus: NetworkConnectivityStatus
) {
    fun login(userLiveData: MutableLiveData<User>, page: Int) {
        if (networkConnectivityStatus.isNetworkConnected())
            remoteLogin.login(userLiveData, page)
        localLogin.login(userLiveData)
    }
}