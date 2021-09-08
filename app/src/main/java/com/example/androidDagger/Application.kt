package com.example.androidDagger

import android.app.Application


class Application :Application(){
    val appComponent=DaggerApplicationGraph.create()
}