package com.example.githubrepoapp.presentation.di

import com.example.githubrepoapp.data.api.GitHubApiService
import com.example.githubrepoapp.data.repository.datasource.GithubRemoteDatasource
import com.example.githubrepoapp.data.repository.datasourceImpl.GithubRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RemoteDataModule(private val apiKey:String) {
    @Singleton
    @Provides
    fun provideGithubRemoteDataSource(service: GitHubApiService):GithubRemoteDatasource{
        return GithubRemoteDataSourceImpl(
            service,
            apiKey
        )
    }
}