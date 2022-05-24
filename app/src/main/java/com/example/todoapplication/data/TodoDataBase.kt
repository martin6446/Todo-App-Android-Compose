package com.example.todoapplication.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [TodoEntity::class],
    version = 1
)
abstract class TodoDataBase: RoomDatabase() {
    abstract val dao: TodoDao
}