package com.example.dagger

import javax.inject.Inject
import javax.inject.Singleton

//if you want user repo only create one time of its container lifecycle use @Singleton annotation
@Singleton
class UserRepository @Inject constructor (private val localDataSource: LocalDataSource,private val remoteDataSource: RemoteDataSource) {
}