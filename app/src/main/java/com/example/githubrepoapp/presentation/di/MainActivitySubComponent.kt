package com.example.githubrepoapp.presentation.di

import com.example.githubrepoapp.presentation.AddRepoScreenActivity
import com.example.githubrepoapp.presentation.MainActivity
import dagger.Subcomponent

@GithubScope
@Subcomponent(
    modules = [
        MainActivityModule::class
    ]
)
interface MainActivitySubComponent {
    fun inject(mainActivity: MainActivity)

    @Subcomponent.Factory
    interface Factory{
        fun create():MainActivitySubComponent
    }

}