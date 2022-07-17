package com.mindorks.bootcamp.demo.ui.home

import com.mindorks.bootcamp.demo.data.local.DatabaseService
import com.mindorks.bootcamp.demo.data.remote.NetworkService
import com.mindorks.bootcamp.demo.di.FragmentScope
import com.mindorks.bootcamp.demo.utils.NetworkHelper

import javax.inject.Inject

@FragmentScope
class HomeViewModel @Inject constructor(
        private val databaseService: DatabaseService,
        private val networkService: NetworkService,
        private val networkHelper: NetworkHelper) {

    val someData: String
        get() = "HomeViewModel"
}
