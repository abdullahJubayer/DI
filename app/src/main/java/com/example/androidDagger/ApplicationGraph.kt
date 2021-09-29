package com.example.androidDagger

import com.example.androidDagger.login.LoginActivity
import dagger.Component
import javax.inject.Singleton

@Component(modules = [RemoteRetrofitModule::class])
@Singleton
interface ApplicationGraph {
    fun inject(activity: MainActivity)
    fun inject(activity: LoginActivity)
}