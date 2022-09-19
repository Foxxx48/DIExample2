package com.fox.diexample2.presentation

import androidx.lifecycle.ViewModel
import com.fox.diexample2.domain.UseCase

class MainViewModel(private val useCase: UseCase): ViewModel() {
    fun method() {
        useCase()
    }
}