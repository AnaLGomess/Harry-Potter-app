package com.br.harry_potter_app.di

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class ApplicationSession : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(networkModules)
            modules(dataBaseModule)
            modules(dataModule)
            modules(domainModule)
            modules(presentationModule)
            androidLogger()
            androidContext(this@ApplicationSession)
        }
    }
}