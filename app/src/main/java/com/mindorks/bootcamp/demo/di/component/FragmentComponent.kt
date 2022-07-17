package com.mindorks.bootcamp.demo.di.component

import com.mindorks.bootcamp.demo.di.module.FragmentModule
import com.mindorks.bootcamp.demo.di.FragmentScope
import com.mindorks.bootcamp.demo.ui.home.HomeFragment

import dagger.Component

@FragmentScope
@Component(dependencies = [ApplicationComponent::class], modules = [FragmentModule::class])
interface FragmentComponent {

    fun inject(fragment: HomeFragment)
}
