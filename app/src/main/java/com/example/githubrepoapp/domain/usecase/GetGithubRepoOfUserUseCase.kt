package com.example.githubrepoapp.domain.usecase

import com.example.githubrepoapp.data.model.ReposItem
import com.example.githubrepoapp.domain.repository.GithubRepository

class GetGithubRepoOfUserUseCase(private val githubRepository: GithubRepository) {
    suspend fun execute(): List<ReposItem> = githubRepository.getListOfRepos()
}