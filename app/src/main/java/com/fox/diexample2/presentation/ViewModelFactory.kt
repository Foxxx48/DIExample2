package com.fox.diexample2.presentation

import android.graphics.ColorSpace
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.fox.diexample2.domain.Repository
import com.fox.diexample2.domain.UseCase
import javax.inject.Inject

class ViewModelFactory @Inject constructor(private val useCase: UseCase,
private val repository: Repository
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass == MainViewModel::class.java) {
            return MainViewModel(useCase) as T
        }
        if (modelClass == MainViewModel2::class.java) {
            return MainViewModel2(repository) as T
        }
        throw RuntimeException("Unknown ViewModel class $modelClass")
    }
}