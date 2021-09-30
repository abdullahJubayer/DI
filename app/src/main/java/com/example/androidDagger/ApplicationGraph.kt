package com.example.androidDagger

import com.example.androidDagger.singleton.LoginActivity
import com.example.androidDagger.simple_injection_with_module.MainActivity
import com.example.androidDagger.simple_injection_with_module.RemoteRetrofitModule
import com.example.androidDagger.sub_component.LoginComponent
import com.example.androidDagger.sub_component.LoginComponentModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [RemoteRetrofitModule::class,com.example.androidDagger.singleton.RemoteRetrofitModule::class,LoginComponentModule::class])
interface ApplicationGraph {
    fun inject(activity: MainActivity)
    fun inject(activity: LoginActivity)
    fun loginFragmentComponent():LoginComponent.Factory
}