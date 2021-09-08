package com.example.androidDagger

import dagger.Component

@Component
interface ApplicationGraph {
    fun inject(activity: MainActivity)
}