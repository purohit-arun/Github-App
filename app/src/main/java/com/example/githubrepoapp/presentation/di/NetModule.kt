package com.example.githubrepoapp.presentation.di

import android.content.Context
import com.chuckerteam.chucker.api.ChuckerInterceptor
import com.example.githubrepoapp.data.api.GitHubApiService
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class NetModule(private val baseUrl:String,private val context: Context) {

    @Singleton
    @Provides
    fun provideRetrofit():Retrofit{
       /* val client = OkHttpClient.Builder()
            .addInterceptor(ChuckerInterceptor(context))
            .build()*/

        val client = OkHttpClient.Builder()
            .addInterceptor(ChuckerInterceptor(context))
            .build()


        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .baseUrl(baseUrl)
            .build()
    }

    @Singleton
    @Provides
    fun provideGithubApiService(retrofit: Retrofit):GitHubApiService{
        return retrofit.create(GitHubApiService::class.java)
    }

}