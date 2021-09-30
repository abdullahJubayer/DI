package com.example.androidDagger.simple_injection_with_module

import androidx.lifecycle.MutableLiveData
import com.example.androidDagger.singleton.User
import javax.inject.Inject

class ViewModel @Inject constructor(private val repository: Repository) {
    private val userLiveData: MutableLiveData<User> = MutableLiveData()

    fun getData(): MutableLiveData<User> {
         repository.fetchData(userLiveData)
        return userLiveData
    }
}