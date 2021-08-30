package com.example.di

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get

class MainActivity : AppCompatActivity() {

    private lateinit var mainActivityViewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Manual Dependency Ingection
        val remoteDataSource=RemoteDataSource();
        val localDataSource=LocalDataSource()
        val mainActivityRepo=MainActivityRepo(localDataSource,remoteDataSource)
        mainActivityViewModel= MainActivityViewModel(mainActivityRepo)

        //Dependency Injection Container
        mainActivityViewModel= MainActivityViewModel((application as Application).appContainer.mainActivityRepo)

        //factory method to create new instance when you want
        mainActivityViewModel=(application as Application).appContainer.mainActivityViewModel.create()
    }
}