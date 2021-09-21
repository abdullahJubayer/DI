package com.example.androidDagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.di.R
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var viewModel: ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        (applicationContext as Application).appComponent.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        Log.e("DEBUG", "Data : ${viewModel.getData()}" )
        (applicationContext as Application).appComponent.inject(this)
        Log.e("DEBUG", "Data : ${viewModel.getData()}" )
    }
}