package com.example.di

class LoginContainer(mainActivityRepo: MainActivityRepo){
    val loginViewModel=LoginViewModelFactory(mainActivityRepo)
}

class AppContainer {
    private val localDataSource=LocalDataSource()
    private val remoteDataSource=RemoteDataSource()
    val mainActivityRepo=MainActivityRepo(localDataSource,remoteDataSource)
    val mainActivityViewModel=MainActivityViewModelFactory(mainActivityRepo)

    var loginContainer:LoginContainer?=null
}