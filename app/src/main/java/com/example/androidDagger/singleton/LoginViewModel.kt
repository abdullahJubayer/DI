package com.example.androidDagger.singleton

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.androidDagger.Application
import javax.inject.Inject
import javax.inject.Singleton

class LoginViewModel @Inject constructor(private val repository: Repository) {
    private val userLiveData: MutableLiveData<User> = MutableLiveData()

    fun login(page:Int): MutableLiveData<User> {
        Log.e("TAG2", "Data : ${repository.toString()}" )
        Log.e("TAG2", "Data : ${repository.toString()}" )

            repository.login(userLiveData,page)
        return userLiveData
    }
}