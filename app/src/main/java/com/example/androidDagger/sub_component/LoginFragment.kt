package com.example.androidDagger.sub_component

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.manual_di.R
import javax.inject.Inject

class LoginFragment() : Fragment() {

    @Inject lateinit var loginViewModel:LoginViewModel

    override fun onAttach(context: Context) {
        (activity as LoginFragmentActivity).loginComponent.inject(this)
        super.onAttach(context)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //hare whenever loginActivity Created a new Instance of view model created
        Log.e("TAG3", "Data : ${loginViewModel.toString()}" )
    }
}