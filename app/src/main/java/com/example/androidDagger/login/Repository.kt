package com.example.androidDagger.login

import androidx.lifecycle.MutableLiveData
import com.example.androidDagger.NetworkConnectivityStatus
import javax.inject.Inject

class Repository @Inject constructor(private val localLogin: LocalLogin,private val remoteLogin: RemoteLogin,private val networkConnectivityStatus: NetworkConnectivityStatus) {
    fun login(userLiveData: MutableLiveData<User>): String {
        if (networkConnectivityStatus.isNetworkConnected())
            return remoteLogin.login(userLiveData)
        return localLogin.login()
    }
}