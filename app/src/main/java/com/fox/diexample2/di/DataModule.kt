package com.fox.diexample2.di

import com.fox.diexample2.data.datasource.LocalDataSource
import com.fox.diexample2.data.datasource.LocalDataSourceImpl
import com.fox.diexample2.data.datasource.RemoteDataSource
import com.fox.diexample2.data.datasource.RemoteDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
interface DataModule {


    @Binds
    fun bindLocalData(impl: LocalDataSourceImpl): LocalDataSource


    @Binds
    fun bindRemoteData(impl: RemoteDataSourceImpl): RemoteDataSource
}