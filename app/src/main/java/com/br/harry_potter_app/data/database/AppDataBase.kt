package com.br.harry_potter_app.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.br.harry_potter_app.data.database.dao.CharactersDao
import com.br.harry_potter_app.data.database.entity.CharactersEntity

@Database(entities = [CharactersEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun charactersDao(): CharactersDao
}