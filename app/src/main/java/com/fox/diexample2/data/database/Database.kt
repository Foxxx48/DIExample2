package com.fox.diexample2.data.database

import android.util.Log
import javax.inject.Inject

class Database @Inject constructor() {
    fun method() {
        Log.d(TAG_LOG, "Database")
    }
    companion object {
        private const val TAG_LOG = "TEST"
    }
}