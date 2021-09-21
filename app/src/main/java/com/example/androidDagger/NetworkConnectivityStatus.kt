package com.example.androidDagger

import javax.inject.Inject

class NetworkConnectivityStatus @Inject constructor() {
    fun isNetworkConnected(): Boolean {
        return true
    }
}