package com.fox.diexample2.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.fox.diexample2.di.IdQualifier
import com.fox.diexample2.di.NameQualifier
import com.fox.diexample2.domain.UseCase
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val useCase: UseCase,
    @IdQualifier private val id: String,
    @NameQualifier private val name: String
) : ViewModel() {

    fun method() {
        useCase()
        Log.d("MainViewModel", "$this $id $name")
    }

}