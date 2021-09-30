package com.example.androidDagger.simple_injection_with_module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import com.example.androidDagger.Application
import com.example.androidDagger.singleton.LoginActivity
import com.example.androidDagger.sub_component.LoginFragmentActivity
import com.example.manual_di.R
import kotlinx.android.synthetic.main.activity_main2.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var viewModel: ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        (applicationContext as Application).appComponent.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //So hare whenever we inject a viewModel  model, a new instace of viewModel is created
        Log.e("TAG", "Data : ${viewModel.toString()}" )
        Log.e("TAG", "Data : ${viewModel.toString()}" )
        (applicationContext as Application).appComponent.inject(this)
        Log.e("TAG", "Data : ${viewModel.toString()}" )

        viewModel.getData().observe(this, Observer {
            Log.e("TAG", "Data : ${it.page}" )
        })

        button.setOnClickListener {
            startActivity(Intent(this,LoginActivity::class.java))
        }
        button2.setOnClickListener {
            startActivity(Intent(this,LoginFragmentActivity::class.java))
        }

    }
}