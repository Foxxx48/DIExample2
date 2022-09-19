package com.fox.diexample2

import android.app.Application
import com.fox.diexample2.di.DaggerAppComponent

class App : Application() {

    val myComponent by lazy { DaggerAppComponent.factory()
        .create(this, System.currentTimeMillis())
    }
}