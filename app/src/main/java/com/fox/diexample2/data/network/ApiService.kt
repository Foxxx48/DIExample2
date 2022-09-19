package com.fox.diexample2.data.network

import android.util.Log
import javax.inject.Inject

class ApiService @Inject constructor() {
    fun method(){
        Log.d(LOG_TAG, "ApiService")
    }
    companion object {
        private const val LOG_TAG = "TEST"
    }
}