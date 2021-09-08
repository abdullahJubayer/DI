package com.example.androidDagger

import javax.inject.Inject

class RemoteDataSource @Inject constructor() {
    fun fetchData(): String {
        return "Hello From ${this.javaClass.canonicalName}"
    }
}