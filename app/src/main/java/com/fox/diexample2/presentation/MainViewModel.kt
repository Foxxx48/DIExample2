package com.fox.diexample2.presentation

import androidx.lifecycle.ViewModel
import com.fox.diexample2.domain.UseCase
import javax.inject.Inject

class MainViewModel @Inject constructor(private val useCase: UseCase) {
    fun method() {
        useCase()
    }
}