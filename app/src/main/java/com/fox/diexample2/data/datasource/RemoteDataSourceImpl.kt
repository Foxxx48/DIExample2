package com.fox.diexample2.data.datasource

import com.fox.diexample2.data.network.ApiService
import javax.inject.Inject

class RemoteDataSourceImpl @Inject constructor(private val apiService: ApiService) : RemoteDataSource {
    override fun method() {
        apiService.method()
    }
}