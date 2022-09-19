package com.fox.diexample2.di

import android.content.Context
import com.fox.diexample2.presentation.MainActivity
import dagger.BindsInstance
import dagger.Component

@Component( modules = [DataModule::class, DomainModule::class])
interface AppComponent {

    fun inject(activity: MainActivity)

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