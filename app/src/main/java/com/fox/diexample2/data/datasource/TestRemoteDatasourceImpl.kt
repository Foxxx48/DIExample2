package com.fox.diexample2.data.datasource

import android.util.Log
import com.fox.diexample2.data.network.ApiService
import javax.inject.Inject

class TestRemoteDatasourceImpl @Inject constructor() : RemoteDataSource {
    override fun method() {
        Log.d("TestRemoteDatasource", "TEST")
    }
}