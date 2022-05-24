package com.example.todoapplication.data

import kotlinx.coroutines.flow.Flow

interface TodoRepository {
    suspend fun insertTodo(todoEntity: TodoEntity)

    suspend fun deleteTodo(todoEntity: TodoEntity)

    suspend fun getTodoById(todoId: Int): TodoEntity?

    fun getTodos(): Flow<List<TodoEntity>>
}