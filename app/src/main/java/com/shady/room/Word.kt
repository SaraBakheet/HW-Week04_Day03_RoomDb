package com.shady.room

import androidx.room.ColumnInfo
import androidx.room.PrimaryKey

@Entity(tableName = "word_table")
class Word
    (@PrimaryKey
     @ColumnInfo
         (name = "word") val word: String)