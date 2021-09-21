package com.example.androidDagger

import dagger.Component

@Component(modules = [RemoteRetrofitModule::class])
interface ApplicationGraph {
    fun inject(activity: MainActivity)
}