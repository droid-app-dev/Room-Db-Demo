package com.mindorks.bootcamp.demo.di.module

import android.content.Context
import androidx.room.Room
import com.mindorks.bootcamp.demo.MyApplication
import com.mindorks.bootcamp.demo.data.local.DatabaseService
import com.mindorks.bootcamp.demo.data.local.MIGRATION_1_2
import com.mindorks.bootcamp.demo.di.ApplicationContext
import com.mindorks.bootcamp.demo.di.NetworkInfo
import dagger.Module
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Singleton

@Module
class ApplicationModule(private val application: MyApplication) {

    @ApplicationContext
    @Provides
    fun provideContext(): Context = application

    @Provides
    fun provideCompositeDisposable(): CompositeDisposable = CompositeDisposable()

    @Provides
    @NetworkInfo
    fun provideApiKey(): String = "SOME_API_KEY"

    @Provides
    @Singleton
    fun provideDatabaseService(): DatabaseService = Room.databaseBuilder(
            application,
            DatabaseService::class.java,
            "bootcamp-database-project-db")
            .addMigrations(MIGRATION_1_2)
            .build()
}
