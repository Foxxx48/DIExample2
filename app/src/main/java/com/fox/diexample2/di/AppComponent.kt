package com.fox.diexample2.di

import android.content.Context
import com.fox.diexample2.data.database.Database
import com.fox.diexample2.presentation.MainActivity
import com.fox.diexample2.presentation.MainActivity2
import com.fox.diexample2.presentation.MainViewModel
import dagger.BindsInstance
import dagger.Component
import javax.inject.Scope
import javax.inject.Singleton

@AppScope
@Component( modules = [DataModule::class, DomainModule::class, ViewModelModule::class])
interface AppComponent {

    fun inject(activity: MainActivity)
    fun inject(activity: MainActivity2)

//    fun getViewModel(): MainViewModel
//
//    fun getDataBase(): Database

//    @Component.Builder
//    interface AppComponentBuilder {
//
//        @BindsInstance
//        fun context(context: Context): AppComponentBuilder
//
//        fun build(): AppComponent
//
//        @BindsInstance
//        fun localTime(timeMillis: Long) : AppComponentBuilder
//    }

    @Component.Factory
    interface AppComponentFactory {
        fun create(
            @BindsInstance context: Context,
            @BindsInstance timeMillis: Long
        ): AppComponent
    }

}