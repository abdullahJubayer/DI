package com.example.androidDagger.sub_component

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.androidDagger.Application
import com.example.manual_di.R
import kotlinx.android.synthetic.main.activity_login2.*
import javax.inject.Inject

class LoginFragmentActivity : AppCompatActivity() {
    lateinit var loginComponent:LoginComponent
    @Inject lateinit var loginViewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loginComponent=(applicationContext as Application).appComponent.loginFragmentComponent().create()
        loginComponent.inject(this)
        setContentView(R.layout.activity_login2)


        fragment1.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.container,LoginFragment())
                .addToBackStack(null)
                .commit()
        }
        fragment2.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.container,RegistrationFragment())
                .addToBackStack(null)
                .commit()
        }

    }
}