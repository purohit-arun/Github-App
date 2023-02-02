package com.example.githubrepoapp.data.api

import com.example.githubrepoapp.data.model.ReposList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers

interface GitHubApiService {

    @Headers(
        "Accept: application/vnd.github+json",
        "Authorization: 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",
        "X-GitHub-Api-Version: 2022-11-28",
    )
    @GET("users/purohit-arun/repos")
    suspend fun getAllRepos(): Response<ReposList>

}