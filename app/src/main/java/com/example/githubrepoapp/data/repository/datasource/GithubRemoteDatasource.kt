package com.example.githubrepoapp.data.repository.datasource

import com.example.githubrepoapp.data.model.ReposList
import retrofit2.Response

interface GithubRemoteDatasource {
    suspend fun getRepos():Response<ReposList>
}