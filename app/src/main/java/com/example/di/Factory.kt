package com.example.di

interface Factory<T> {
    fun create(): T
}

class MainActivityViewModelFactory(private val mainActivityRepo: MainActivityRepo) : Factory<MainActivityViewModel> {
    override fun create(): MainActivityViewModel {
        return MainActivityViewModel(mainActivityRepo)
    }

}
class LoginViewModelFactory(private val mainActivityRepo: MainActivityRepo) : Factory<LoginViewModel> {
    override fun create(): LoginViewModel {
        return LoginViewModel(mainActivityRepo)
    }

}