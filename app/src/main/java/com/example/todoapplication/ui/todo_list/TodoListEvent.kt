package com.example.todoapplication.ui.todo_list

import com.example.todoapplication.data.TodoEntity

sealed class TodoListEvent {
    data class OnDeleteTodoClick(val todo: TodoEntity): TodoListEvent()
    data class OnDoneChange(val todo: TodoEntity, val isDone: Boolean): TodoListEvent()
    object OnUndoDeleteClick: TodoListEvent()
    data class OnTodoClick(val todo: TodoEntity): TodoListEvent()
    object OnAddTodoClick: TodoListEvent()
}