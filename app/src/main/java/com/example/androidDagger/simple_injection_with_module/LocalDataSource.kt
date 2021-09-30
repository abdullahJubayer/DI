package com.example.androidDagger.simple_injection_with_module

import androidx.lifecycle.MutableLiveData
import com.example.androidDagger.singleton.User
import javax.inject.Inject

class LocalDataSource @Inject constructor() {
    fun fetchData(userLiveData: MutableLiveData<User>) {
        userLiveData.value = User(0,0,0,0,null,null)
    }
}