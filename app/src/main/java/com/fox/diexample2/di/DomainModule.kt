package com.fox.diexample2.di

import com.fox.diexample2.data.repository.RepositoryImpl
import com.fox.diexample2.domain.Repository
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface DomainModule {


    @Binds
    fun bindRepository(impl: RepositoryImpl): Repository
}