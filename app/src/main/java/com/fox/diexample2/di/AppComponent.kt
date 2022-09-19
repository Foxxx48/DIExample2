package com.fox.diexample2.di

import android.app.Activity
import com.fox.diexample2.presentation.MainActivity
import dagger.Component

@Component( modules = [DataModule::class, DomainModule::class])
interface AppComponent {

    fun inject(activity: MainActivity)
}