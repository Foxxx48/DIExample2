package com.fox.diexample2.di

import com.fox.diexample2.data.repository.RepositoryImpl
import com.fox.diexample2.domain.Repository
import dagger.Module
import dagger.Provides

@Module
class DomainModule {

    @Provides
    fun provideRepository(impl: RepositoryImpl): Repository {
        return impl
    }
}