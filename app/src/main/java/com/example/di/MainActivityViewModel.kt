package com.example.di

import android.app.Application
import androidx.lifecycle.AndroidViewModel

class MainActivityViewModel(private val mainActivityRepo: MainActivityRepo,
                            application: Application
) : AndroidViewModel(application) {
}