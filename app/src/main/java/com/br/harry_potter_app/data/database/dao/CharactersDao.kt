package com.br.harry_potter_app.data.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.br.harry_potter_app.data.database.entity.CharactersEntity

@Dao
interface CharactersDao {
    @Query("SELECT * FROM characters")
    fun getAll(): List<CharactersEntity>

    @Query("SELECT * FROM characters WHERE id IN (:charactersIds)")
    fun loadAllByIds(charactersIds: Int): CharactersEntity

    @Query("SELECT * FROM characters WHERE full_name LIKE :fullName AND " +
            "interpreted_by LIKE :interpretedBy LIMIT 1")
    fun findByName(fullName: String, interpretedBy: String): CharactersEntity

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(characters: CharactersEntity) : Int

    @Delete
    fun delete(characters: CharactersEntity)
}