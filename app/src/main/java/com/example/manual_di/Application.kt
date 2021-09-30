package com.example.manual_di

import android.app.Application

class Application : Application() {
    val appContainer=AppContainer()
}