package com.fox.diexample2.data.datasource

import com.fox.diexample2.data.network.ApiService

class RemoteDataSourceImpl(private val apiService: ApiService) : RemoteDataSource {
    override fun method() {
        apiService.method()
    }

}