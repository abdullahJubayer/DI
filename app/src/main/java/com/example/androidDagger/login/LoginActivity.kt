package com.example.androidDagger.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import com.example.androidDagger.Application
import com.example.androidDagger.ViewModel
import com.example.di.R
import javax.inject.Inject

class LoginActivity : AppCompatActivity() {
    @Inject
    lateinit var viewModel: LoginViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (applicationContext as Application).appComponent.inject(this)
        setContentView(R.layout.activity_login)

        viewModel.login(6).observe(this, Observer {
            Log.e("TAG", "onCreate: "+it.page )
        })
        viewModel.login(5).observe(this, Observer {
            Log.e("TAG", "onCreate: "+it.page )
        })
    }
}