package com.fox.diexample2.data.datasource

import com.fox.diexample2.data.database.Database

class LocalDataSourceImpl(private val database: Database) : LocalDataSource {
    override fun method() {
        database.method()
    }

}