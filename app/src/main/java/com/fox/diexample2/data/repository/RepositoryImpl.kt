package com.fox.diexample2.data.repository

import com.fox.diexample2.data.datasource.*
import com.fox.diexample2.domain.Repository
import com.fox.diexample2.data.mapper.Mapper
import com.fox.diexample2.di.ProdQualifier
import com.fox.diexample2.di.TestQualifier
import javax.inject.Inject


class RepositoryImpl @Inject constructor(
    private val localDataSource: LocalDataSource,
    @ProdQualifier private val remoteDataSource: RemoteDataSource,
    private val mapper: Mapper
) : Repository {
    override fun method() {

        remoteDataSource.method()

        mapper.map()

        localDataSource.method()
    }
}