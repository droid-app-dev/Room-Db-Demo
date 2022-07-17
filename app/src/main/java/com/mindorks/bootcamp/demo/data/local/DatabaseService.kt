package com.mindorks.bootcamp.demo.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.mindorks.bootcamp.demo.data.local.dao.AddressDao
import com.mindorks.bootcamp.demo.data.local.dao.UserDao
import com.mindorks.bootcamp.demo.data.local.entity.Address
import com.mindorks.bootcamp.demo.data.local.entity.User
import javax.inject.Singleton

@Singleton
@Database(
        entities = [
            User::class,
            Address::class
        ],
        exportSchema = false,
        version = 2
)
@TypeConverters(Converter::class)
abstract class DatabaseService : RoomDatabase() {

    abstract fun addressDao(): AddressDao

    abstract fun userDao(): UserDao
}