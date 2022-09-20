package com.fox.diexample2.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.fox.diexample2.di.IdQualifier
import com.fox.diexample2.di.NameQualifier
import com.fox.diexample2.domain.Repository
import javax.inject.Inject

class MainViewModel2 @Inject constructor(
    private val repository: Repository,
    @IdQualifier private val id: String,
    @NameQualifier private val name: String
) : ViewModel() {
    fun method() {
        repository.method()
        Log.d("MainViewModel2", "$this $id $name ")
    }
}