package com.example.androidDagger

import com.example.androidDagger.singleton.LoginActivity
import com.example.androidDagger.simple_injection_with_module.MainActivity
import com.example.androidDagger.simple_injection_with_module.RemoteRetrofitModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [RemoteRetrofitModule::class,com.example.androidDagger.singleton.RemoteRetrofitModule::class])
interface ApplicationGraph {
    fun inject(activity: MainActivity)
    fun inject(activity: LoginActivity)
}