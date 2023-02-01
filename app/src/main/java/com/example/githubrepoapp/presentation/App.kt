package com.example.githubrepoapp.presentation

import android.app.Application
import com.example.githubrepoapp.presentation.di.*

class App: Application(),Injector {
    private lateinit var appComponent: AppComponent


    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(applicationContext))
            .netModule(NetModule("https://api.github.com/", context = applicationContext))
            .remoteDataModule(RemoteDataModule("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"))
            .build()
    }

    override fun createMainActivitySubComponent(): MainActivitySubComponent {
        return appComponent.mainActivitySubComponent().create()
    }
}