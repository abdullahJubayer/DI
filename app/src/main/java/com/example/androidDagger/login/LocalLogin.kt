package com.example.androidDagger.login

import javax.inject.Inject

class LocalLogin @Inject constructor(){
    fun login(): String {
        return "Local Login Success"
    }
}