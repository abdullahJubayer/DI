package com.example.androidDagger.sub_component

import androidx.lifecycle.MutableLiveData
import com.example.androidDagger.singleton.User
import javax.inject.Inject

class LocalLogin @Inject constructor(){
    fun login(userLiveData: MutableLiveData<User>) {
        userLiveData.value = User(0,0,0,0,null,null)
    }
}