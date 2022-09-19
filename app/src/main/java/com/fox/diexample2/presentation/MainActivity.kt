package com.fox.diexample2.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.fox.diexample2.R
import com.fox.diexample2.di.DaggerAppComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var viewModel: MainViewModel

    private val myComponent by lazy { DaggerAppComponent.builder()
        .context(application)
        .localTime(System.currentTimeMillis())
        .build()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        myComponent.inject(this)
//        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        setContentView(R.layout.activity_main)
        viewModel.method()
    }
}