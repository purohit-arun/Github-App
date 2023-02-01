package com.example.githubrepoapp.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.githubrepoapp.R
import com.example.githubrepoapp.data.model.ReposItem
import com.example.githubrepoapp.databinding.RepoListCellBinding

class GithubListAdapter(): RecyclerView.Adapter<MyViewHolder>() {
    private val repoList = ArrayList<ReposItem>()

    fun setList(repos:List<ReposItem>){
        repoList.clear()
        repoList.addAll(repos)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.repo_list_cell, parent, false)
        return MyViewHolder(RepoListCellBinding.bind(view))
    }

    override fun getItemCount(): Int {
        return repoList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(repoList[position])
    }

}

class MyViewHolder(val binding:RepoListCellBinding):ViewHolder(binding.root)
{
    fun bind(repo:ReposItem){
        binding.titleTextView.text = repo.name
        binding.descriptionTextView.text = repo.description
    }

}