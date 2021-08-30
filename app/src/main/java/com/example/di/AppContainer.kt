package com.example.di

class MainActivityContainer(mainActivityRepo: MainActivityRepo){
    val mainActivityViewModel=MainActivityViewModelFactory(mainActivityRepo)
}

class AppContainer {
    private val localDataSource=LocalDataSource()
    private val remoteDataSource=RemoteDataSource()
    val mainActivityRepo=MainActivityRepo(localDataSource,remoteDataSource)
    val mainActivityViewModel=MainActivityViewModelFactory(mainActivityRepo)

    var mainActivityContainer:MainActivityContainer?=null
}