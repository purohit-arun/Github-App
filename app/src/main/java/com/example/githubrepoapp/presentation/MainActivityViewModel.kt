package com.example.githubrepoapp.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.githubrepoapp.domain.usecase.GetGithubRepoOfUserUseCase

class MainActivityViewModel(
    private val getGithubRepoOfUserUseCase: GetGithubRepoOfUserUseCase
):ViewModel() {

    fun getRepos() = liveData {
        val repoList = getGithubRepoOfUserUseCase.execute()
        emit(repoList)
    }
}