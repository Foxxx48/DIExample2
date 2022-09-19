package com.fox.diexample2.data.network

import android.content.Context
import android.util.Log
import com.fox.diexample2.R
import javax.inject.Inject

class ApiService @Inject constructor(
    private val context: Context,
    private val timeMillis: Long
) {
    fun method() {
        Log.d(LOG_TAG, "ApiService ${context.getString(R.string.app_name)} $timeMillis")
    }



    companion object {
        private const val LOG_TAG = "TEST"
    }
}