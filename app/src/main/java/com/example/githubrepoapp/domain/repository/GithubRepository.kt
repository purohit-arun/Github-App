package com.example.githubrepoapp.domain.repository

import com.example.githubrepoapp.data.model.ReposItem
import com.example.githubrepoapp.data.model.ReposList

interface GithubRepository {
    suspend fun getListOfRepos():List<ReposItem>
    //suspend fun addRepo():List<GitHubReposItem>
}