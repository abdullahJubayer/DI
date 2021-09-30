package com.example.androidDagger.singleton

import androidx.lifecycle.MutableLiveData
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class LoginViewModel @Inject constructor(private val repository: Repository) {
    private val userLiveData: MutableLiveData<User> = MutableLiveData()

    fun login(page:Int): MutableLiveData<User> {
            repository.login(userLiveData,page)
        return userLiveData
    }
}