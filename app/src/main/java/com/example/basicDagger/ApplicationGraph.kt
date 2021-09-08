package com.example.basicDagger

import dagger.Component

@Component
interface ApplicationGraph {
    fun userRepository():UserRepository
}