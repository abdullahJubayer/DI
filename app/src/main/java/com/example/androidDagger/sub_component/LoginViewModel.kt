package com.example.androidDagger.sub_component

import androidx.lifecycle.MutableLiveData
import com.example.androidDagger.singleton.User
import javax.inject.Inject

class LoginViewModel @Inject constructor(private val repository: Repository) {
    private val userLiveData: MutableLiveData<User> = MutableLiveData()

    fun login(page:Int): MutableLiveData<User> {
            repository.login(userLiveData,page)
        return userLiveData
    }
}