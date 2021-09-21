package com.example.androidDagger

import javax.inject.Inject

class LocalDataSource @Inject constructor() {
    fun fetchData(): String {
        return "Hello From ${this.javaClass.canonicalName} Object Name:${this}"
    }
}