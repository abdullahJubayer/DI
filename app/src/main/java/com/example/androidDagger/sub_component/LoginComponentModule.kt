package com.example.androidDagger.sub_component

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module(subcomponents = [LoginComponent::class])
class LoginComponentModule {
}