package com.fox.diexample2.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.fox.diexample2.domain.Repository
import javax.inject.Inject

class MainViewModel2 @Inject constructor(private val repository: Repository) : ViewModel() {
    fun method() {
        repository.method()
        Log.d("MainViewModel2", "$this")
    }
}