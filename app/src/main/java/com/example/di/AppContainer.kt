package com.example.di

class AppContainer {
    private val localDataSource=LocalDataSource()
    private val remoteDataSource=RemoteDataSource()
    val mainActivityRepo=MainActivityRepo(localDataSource,remoteDataSource)
}