package com.example.todoapplication.ui.add_edti_todo

sealed class AddEditTodoEvent {
    data class OnTitleChange(val title: String):AddEditTodoEvent()
    data class OnDescriptionChange(val description: String): AddEditTodoEvent()
    object OnSaveTodoClick: AddEditTodoEvent()
}