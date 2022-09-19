package com.fox.diexample2.di

import com.fox.diexample2.data.datasource.LocalDataSource
import com.fox.diexample2.data.datasource.LocalDataSourceImpl
import com.fox.diexample2.data.datasource.RemoteDataSource
import com.fox.diexample2.data.datasource.RemoteDataSourceImpl
import dagger.Module
import dagger.Provides

@Module
class DataModule {

    @Provides
    fun provideLocalData(impl: LocalDataSourceImpl): LocalDataSource {
        return impl
    }

    @Provides
    fun provideRemoteData(impl: RemoteDataSourceImpl): RemoteDataSource {
        return impl
    }
}