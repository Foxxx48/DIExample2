package com.fox.diexample2.data.repository

import com.fox.diexample2.data.datasource.LocalDataSourceImpl
import com.fox.diexample2.data.datasource.RemoteDataSourceImpl
import com.fox.diexample2.domain.Repository
import com.fox.diexample2.data.mapper.Mapper
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val localDataSourceImpl: LocalDataSourceImpl,
    private val remoteDataSourceImpl: RemoteDataSourceImpl,
    private val mapper: Mapper
) : Repository {
    override fun method() {
        mapper.map()
        remoteDataSourceImpl.method()
        localDataSourceImpl.method()
    }
}