package com.example.githubrepoapp.data.repository

import android.util.Log
import com.example.githubrepoapp.data.model.ReposItem
import com.example.githubrepoapp.data.model.ReposList
import com.example.githubrepoapp.data.repository.datasource.GithubRemoteDatasource
import com.example.githubrepoapp.domain.repository.GithubRepository

class GithubRepositoryImpl constructor(
    private val githubRemoteDatasource: GithubRemoteDatasource
) : GithubRepository {
    override suspend fun getListOfRepos(): List<ReposItem> {
        var repoList: List<ReposItem>
           /* ReposItem(
                name = "Github-demo-project",
                fullName = "purohit-arun/Github-demo-project",
                description = "Project relate to github"
            ),
            ReposItem(
                name = "Css-Project",
                fullName = "purohit-arun/css-projects",
                description = "Css Project"
            ),
            ReposItem(
                name = "Css-Project",
                fullName = "purohit-arun/css-projects",
                description = "Css Project"
            ), ReposItem(
                name = "Css-Project",
                fullName = "purohit-arun/css-projects",
                description = "Css Project"
            ), ReposItem(
                name = "Css-Project",
                fullName = "purohit-arun/css-projects",
                description = "Css Project"
            ), ReposItem(
                name = "Css-Project",
                fullName = "purohit-arun/css-projects",
                description = "Css Project"
            ), ReposItem(
                name = "Css-Project",
                fullName = "purohit-arun/css-projects",
                description = "Css Project"
            )
        )*/

       /* try {
            val response = githubRemoteDatasource.getRepos()
            val body = response.body()
            repoList = body!!.reposItem
            Log.i("Response Object", body.reposItem.toString())
        } catch (e: Exception) {
            Log.i("MyTag", e.message.toString())
        }*/

        val response = githubRemoteDatasource.getRepos()
        val body = response.body()
        repoList = body!!.reposItem
        return repoList
    }
}