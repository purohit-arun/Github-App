package com.example.githubrepoapp.data.model


import com.google.gson.annotations.SerializedName

data class ReposList(
    @SerializedName("result")
    val reposItem: List<ReposItem>
)