package com.example.githubrepoapp.data.api

import com.example.githubrepoapp.data.model.ReposItem
import com.example.githubrepoapp.data.model.ReposList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers

interface GitHubApiService {
    @GET("users/purohit-arun/repos")
    suspend fun getAllRepos(): Response<ReposList>

}