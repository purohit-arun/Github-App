package com.example.githubrepoapp.presentation.di

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        NetModule::class,
        RemoteDataModule::class,
        AppModule::class,
        UseCaseModule::class,
        RepositoryModule::class
    ]
)
interface AppComponent {
    fun mainActivitySubComponent(): MainActivitySubComponent.Factory
}