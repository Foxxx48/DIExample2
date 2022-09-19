package com.fox.diexample2.data.network

import android.util.Log

class ApiService {
    fun method(){
        Log.d(LOG_TAG, "ApiService")
    }
    companion object {
        private const val LOG_TAG = "TEST"
    }
}