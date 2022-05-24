package com.example.todoapplication.di

import android.app.Application
import androidx.room.Room
import com.example.todoapplication.data.TodoDataBase
import com.example.todoapplication.data.TodoRepository
import com.example.todoapplication.data.TodoRepositoryImp
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule{

    @Provides
    @Singleton
    fun providesTodoDataBase(app: Application): TodoDataBase{
        return Room.databaseBuilder(
            app,
            TodoDataBase::class.java,
            "todo_data_base"
        ).build()
    }

    @Provides
    @Singleton
    fun providesTodoRepository(db: TodoDataBase): TodoRepository{
        return TodoRepositoryImp(db.dao)
    }
}

