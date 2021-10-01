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

        viewModel.login(6).observe(this, Observer {
            Log.e("TAG2", "onCreate: "+it.page )
        })


        //hare we use @Singleton so whenever we use injection,everytime the the same repository instance will created in view model because it's annotated with Singletone
        (applicationContext as Application).appComponent.inject(this)
        viewModel.login(6).observe(this, Observer {
            Log.e("TAG2", "onCreate: "+it.page )
        })
    }
}