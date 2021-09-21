package com.example.androidDagger

import dagger.Component
import javax.inject.Singleton

@Component
@Singleton
interface ApplicationGraph {
    fun inject(activity: MainActivity)
}