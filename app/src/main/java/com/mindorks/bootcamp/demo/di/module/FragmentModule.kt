package com.mindorks.bootcamp.demo.di.module

import android.content.Context
import androidx.fragment.app.Fragment
import com.mindorks.bootcamp.demo.di.ActivityContext
import dagger.Module
import dagger.Provides

@Module
class FragmentModule(private val fragment: Fragment) {

    @ActivityContext
    @Provides
    fun provideContext(): Context = fragment.context!!
}
