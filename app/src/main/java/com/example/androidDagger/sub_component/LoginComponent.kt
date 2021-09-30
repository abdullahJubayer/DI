package com.example.androidDagger.sub_component

import dagger.Subcomponent

@Subcomponent
interface LoginComponent {
    @Subcomponent.Factory
    interface Factory{
        fun create():LoginComponent
    }
    fun inject(activity: LoginFragmentActivity)
}