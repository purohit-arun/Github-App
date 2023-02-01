package com.example.githubrepoapp.presentation.di

import com.example.githubrepoapp.data.repository.GithubRepositoryImpl
import com.example.githubrepoapp.data.repository.datasource.GithubRemoteDatasource
import com.example.githubrepoapp.domain.repository.GithubRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Provides
    @Singleton
    fun provideGithubRepository(githubRemoteDatasource: GithubRemoteDatasource):GithubRepository{
        return GithubRepositoryImpl(githubRemoteDatasource)
    }


}