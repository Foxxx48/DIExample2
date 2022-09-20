package com.fox.diexample2.di

import com.fox.diexample2.data.datasource.*
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
interface DataModule {

    @AppScope
    @Binds
    fun bindLocalData(impl: LocalDataSourceImpl): LocalDataSource

    @ProdQualifier
    @AppScope
    @Binds
    fun bindRemoteData(impl: RemoteDataSourceImpl): RemoteDataSource

    @TestQualifier
    @AppScope
    @Binds
    fun bindTestRemoteData(impl: TestRemoteDatasourceImpl): RemoteDataSource
}