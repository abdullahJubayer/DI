package com.example.dagger

import dagger.Component

@Component
interface ApplicationGraph {
    fun userRepository():UserRepository
}