package com.example.androidDagger.singleton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import com.example.androidDagger.Application
import com.example.manual_di.R
import javax.inject.Inject

class LoginActivity : AppCompatActivity() {
    @Inject
    lateinit var viewModel: LoginViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (applicationContext as Application).appComponent.inject(this)
        setContentView(R.layout.activity_login)

        //hare we use @Singleton so whenever we inject a viewModel,everytime the the same viewModel instance will return
        Log.e("TAG2", "Data : ${viewModel.toString()}" )
        (applicationContext as Application).appComponent.inject(this)
        Log.e("TAG3", "Data : ${viewModel.toString()}" )

        viewModel.login(6).observe(this, Observer {
            Log.e("TAG2", "onCreate: "+it.page )
        })
    }
}