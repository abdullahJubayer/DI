package com.example.androidDagger.singleton

import androidx.lifecycle.MutableLiveData
import javax.inject.Inject
import javax.inject.Singleton

class LocalLogin @Inject constructor(){
    fun login(userLiveData: MutableLiveData<User>) {
        userLiveData.value = User(0,0,0,0,null,null)
    }
}