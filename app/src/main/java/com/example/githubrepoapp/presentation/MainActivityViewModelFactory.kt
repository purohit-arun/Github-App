package com.example.githubrepoapp.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.githubrepoapp.domain.usecase.GetGithubRepoOfUserUseCase

class MainActivityViewModelFactory(
    private val getGithubRepoOfUserUseCase: GetGithubRepoOfUserUseCase
):ViewModelProvider.Factory {
    override fun<T:ViewModel> create(modelClass: Class<T>):T{
        return MainActivityViewModel(getGithubRepoOfUserUseCase) as T
    }

}