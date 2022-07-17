package com.mindorks.bootcamp.demo.di.component

import com.mindorks.bootcamp.demo.di.module.ActivityModule
import com.mindorks.bootcamp.demo.di.ActivityScope
import com.mindorks.bootcamp.demo.ui.main.MainActivity

import dagger.Component

@ActivityScope
@Component(dependencies = [ApplicationComponent::class], modules = [ActivityModule::class])
interface ActivityComponent {

    fun inject(activity: MainActivity)
}
