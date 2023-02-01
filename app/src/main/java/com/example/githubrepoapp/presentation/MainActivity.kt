package com.example.githubrepoapp.presentation

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.githubrepoapp.R
import com.example.githubrepoapp.databinding.ActivityMainBinding
import com.example.githubrepoapp.presentation.di.Injector
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel
    private lateinit var adapter: GithubListAdapter

    @Inject
    lateinit var factory: MainActivityViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        (application as Injector).createMainActivitySubComponent().inject(this)
        viewModel = ViewModelProvider(this, factory)[MainActivityViewModel::class.java]
        val repoList = viewModel.getRepos()

        /*repoList.observe(this) {
            Log.i("RepoList", it.toString())
            if (it != null) {
                binding.lblListOfRepo.text = repoList.value.toString()
            }

        }*/
        initRecyclerView()
        /* binding.btngetUserList.setOnClickListener {
             binding.lblListOfRepo.text = repoList.value.toString()
         }*/
    }


    private fun initRecyclerView() {
        binding.rvListOfRepo.layoutManager = LinearLayoutManager(this)
        adapter = GithubListAdapter()
        binding.rvListOfRepo.adapter = adapter
        displayRepoList()
    }


    private fun displayRepoList() {
        val repoList = viewModel.getRepos()

        repoList.observe(this) {
            if (it != null) {
                adapter.setList(it)
                adapter.notifyDataSetChanged()
            } else {
                Toast.makeText(applicationContext, "No Data available", Toast.LENGTH_SHORT).show()
            }

        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.add, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_favorite -> {
                val intent = Intent(this@MainActivity, AddRepoScreenActivity::class.java)
                startActivity(intent)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

}