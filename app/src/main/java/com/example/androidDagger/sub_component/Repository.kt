package com.example.androidDagger.sub_component

import androidx.lifecycle.MutableLiveData
import com.example.androidDagger.NetworkConnectivityStatus
import com.example.androidDagger.singleton.User
import javax.inject.Inject

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