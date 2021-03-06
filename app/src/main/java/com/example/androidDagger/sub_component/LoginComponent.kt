package com.example.androidDagger.sub_component

import dagger.Subcomponent
import javax.inject.Scope


@Scope
@Retention(value = AnnotationRetention.RUNTIME)
annotation class ActivityScope

@Subcomponent
@ActivityScope
interface LoginComponent {
    @Subcomponent.Factory
    interface Factory{
        fun create():LoginComponent
    }
    fun inject(activity: LoginFragmentActivity)
    fun inject(loginFragment: LoginFragment)
    fun inject(registrationFragment: RegistrationFragment)
}