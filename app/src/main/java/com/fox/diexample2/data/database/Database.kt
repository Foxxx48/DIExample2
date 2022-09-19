package com.fox.diexample2.data.database

import android.content.Context
import android.util.Log
import com.fox.diexample2.R
import javax.inject.Inject

class Database @Inject constructor(
    private val context: Context,
    private val timeMillis: Long

) {
    fun method() {
        Log.d(TAG_LOG, "Database ${context.getString(R.string.app_name)} $timeMillis")
    }



    companion object {
        private const val TAG_LOG = "TEST"
    }
}