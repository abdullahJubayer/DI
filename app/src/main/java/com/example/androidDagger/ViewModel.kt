package com.example.androidDagger

import javax.inject.Inject

class ViewModel @Inject constructor(private val repository: Repository) {
    fun getData(): String {
        return repository.fetchData()
    }
}