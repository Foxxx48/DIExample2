package com.fox.diexample2.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.fox.diexample2.App
import com.fox.diexample2.R
import javax.inject.Inject

class MainActivity2 : AppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private val viewModel by lazy {
        ViewModelProvider(this, viewModelFactory)[MainViewModel::class.java]
    }
    private val viewModel2 by lazy {
        ViewModelProvider(this, viewModelFactory)[MainViewModel2::class.java]
    }

    private val myComponent by lazy {
        (application as App).myComponent
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        myComponent.inject(this)
        setContentView(R.layout.activity_main2)
        viewModel.method()
        viewModel2.method()
    }
}