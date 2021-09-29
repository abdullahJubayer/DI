package com.example.androidDagger.login

import androidx.lifecycle.MutableLiveData
import javax.inject.Inject

//Hare LoginViewModel not be @Singleton because it's like android view model . so it's lifecycle end when loginActivity finish
class LoginViewModel @Inject constructor(private val repository: Repository) {
    private val userLiveData: MutableLiveData<User> = MutableLiveData()

    fun login(): MutableLiveData<User> {
            repository.login(userLiveData)
        return userLiveData
    }
}