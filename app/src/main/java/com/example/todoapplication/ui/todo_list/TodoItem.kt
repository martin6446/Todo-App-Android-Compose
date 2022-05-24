package com.example.todoapplication.ui.todo_list

import androidx.compose.foundation.layout.*
import androidx.compose.material.Checkbox
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.todoapplication.data.TodoEntity

@Composable
fun TodoItem(
    todo: TodoEntity,
    onEvent: (TodoListEvent) -> Unit,
    modifier: Modifier
) {
    Row(
        modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.Center
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = todo.title,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.width(8.dp))
                IconButton(onClick = { onEvent(TodoListEvent.OnDeleteTodoClick(todo)) }) {
                    Icon(Icons.Default.Delete, "Delete Todo")
                }

            }
            todo.description?.let {
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = it)
            }
        }
    Checkbox(
        checked = todo.completed,
        onCheckedChange = { isChecked ->
            onEvent(TodoListEvent.OnDoneChange(todo, isChecked))
        }
    )
    }
}