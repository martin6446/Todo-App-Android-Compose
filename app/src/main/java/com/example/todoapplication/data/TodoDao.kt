package com.example.todoapplication.data

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface TodoDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTodo(todoEntity: TodoEntity)

    @Delete
    suspend fun deleteTodo(todoEntity: TodoEntity)

    @Query("SELECT * FROM TodoEntity WHERE id = :todoId")
    suspend fun getTodoById(todoId: Int): TodoEntity?

    @Query("SELECT * FROM TodoEntity")
    fun getTodos(): Flow<List<TodoEntity>>
}