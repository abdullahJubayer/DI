package com.example.androidDagger

import com.example.androidDagger.login.LoginActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [RemoteRetrofitModule::class])
interface ApplicationGraph {
    fun inject(activity: MainActivity)
    fun inject(activity: LoginActivity)
}