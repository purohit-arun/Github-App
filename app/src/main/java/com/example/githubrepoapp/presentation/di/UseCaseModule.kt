package com.example.githubrepoapp.presentation.di

import com.example.githubrepoapp.domain.repository.GithubRepository
import com.example.githubrepoapp.domain.usecase.GetGithubRepoOfUserUseCase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class UseCaseModule {

    @Singleton
    @Provides
    fun providesGetGithubRepoOfUserUseCase(githubRepository: GithubRepository):GetGithubRepoOfUserUseCase{
        return GetGithubRepoOfUserUseCase(githubRepository)
    }

}