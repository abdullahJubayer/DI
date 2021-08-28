package com.example.di

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Manual Dependency Ingection
        val remoteDataSource=RemoteDataSource();
        val localDataSource=LocalDataSource()
        val mainActivityRepo=MainActivityRepo(localDataSource,remoteDataSource)
        val viewModel= ViewModelProvider(this)[MainActivityViewModel::class.java]
    }
}