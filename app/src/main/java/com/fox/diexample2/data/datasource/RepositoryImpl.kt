package com.fox.diexample2.data.datasource

import com.fox.diexample2.domain.Repository
import com.fox.diexample2.data.mapper.Mapper

class RepositoryImpl(
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