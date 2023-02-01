package com.example.githubrepoapp.presentation.di

import com.example.githubrepoapp.domain.usecase.GetGithubRepoOfUserUseCase
import com.example.githubrepoapp.presentation.MainActivityViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class MainActivityModule {
    @GithubScope
    @Provides
    fun provideMainViewModelFactory(
        getGithubRepoOfUserUseCase: GetGithubRepoOfUserUseCase
    ): MainActivityViewModelFactory {
        return MainActivityViewModelFactory(
            getGithubRepoOfUserUseCase
        )
    }
}