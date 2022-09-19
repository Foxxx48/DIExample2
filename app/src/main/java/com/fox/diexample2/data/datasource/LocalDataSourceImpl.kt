package com.fox.diexample2.data.datasource

import com.fox.diexample2.data.database.Database
import javax.inject.Inject

class LocalDataSourceImpl @Inject constructor(private val database: Database) : LocalDataSource {
    override fun method() {
        database.method()
    }

}