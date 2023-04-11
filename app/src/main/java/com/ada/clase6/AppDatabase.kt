package com.ada.clase6

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

import com.ada.clase6.data.dao.UserDao
import com.ada.clase6.data.entity.User

@Database(entities = [User::class], version = 1)
@TypeConverters(DateConverter::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}