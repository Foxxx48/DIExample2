package com.fox.diexample2.di

import androidx.lifecycle.ViewModel
import com.fox.diexample2.presentation.MainViewModel
import com.fox.diexample2.presentation.MainViewModel2
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey

@Module
interface ViewModelModule {

    @IntoMap
    @ViewModelKey(MainViewModel::class)
    @Binds
    fun bindMainViewModel(Impl: MainViewModel): ViewModel

    @IntoMap
    @ViewModelKey(MainViewModel2::class)
    @Binds
    fun bindMainViewModel2(Impl: MainViewModel2): ViewModel
}