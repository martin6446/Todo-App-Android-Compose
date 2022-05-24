package com.example.todoapplication.data

import kotlinx.coroutines.flow.Flow

class TodoRepositoryImp(
    private val dao: TodoDao
): TodoRepository {
    override suspend fun insertTodo(todoEntity: TodoEntity) {
        dao.insertTodo(todoEntity)
    }

    override suspend fun deleteTodo(todoEntity: TodoEntity) {
        dao.deleteTodo(todoEntity)
    }

    override suspend fun getTodoById(todoId: Int): TodoEntity? {
        return dao.getTodoById(todoId)
    }

    override fun getTodos(): Flow<List<TodoEntity>> {
        return dao.getTodos()
    }
}