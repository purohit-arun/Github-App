package com.example.githubrepoapp.data.repository.datasourceImpl

import com.example.githubrepoapp.data.api.GitHubApiService
import com.example.githubrepoapp.data.model.ReposItem
import com.example.githubrepoapp.data.model.ReposList
import com.example.githubrepoapp.data.repository.datasource.GithubRemoteDatasource
import retrofit2.Response

class GithubRemoteDataSourceImpl(
    private val service: GitHubApiService,
    private val apiKey:String
) : GithubRemoteDatasource {
    override suspend fun getRepos(): Response<ReposList> = service.getAllRepos()
}