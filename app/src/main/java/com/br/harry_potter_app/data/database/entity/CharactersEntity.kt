package com.br.harry_potter_app.data.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "characters")
data class CharactersEntity (
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    @ColumnInfo(name = "full_name") val fullName: String,
    @ColumnInfo(name = "nick_name")val nickName: String,
    @ColumnInfo(name = "hogwarts_house")val hogwartsHouse: String,
    @ColumnInfo(name = "interpreted_by")val interpretedBy: String,
    @ColumnInfo(name = "children")val children: String,
    @ColumnInfo(name = "image")val image: String,
    @ColumnInfo(name = "birth_date")val birthdate: String,
)
