package com.fox.diexample2.data.database

import android.content.Context
import android.util.Log
import com.fox.diexample2.R
import com.fox.diexample2.di.AppScope
import javax.inject.Inject
import javax.inject.Singleton

@AppScope
class Database @Inject constructor(
    private val context: Context,
    private val timeMillis: Long

) {
    fun method() {
        Log.d(TAG_LOG, "Database ${context.getString(R.string.app_name)} $timeMillis $this")
    }



    companion object {
        private const val TAG_LOG = "TEST"
    }
}