package com.example.myheroacademiaapi.utils

import android.app.Application
import com.example.myheroacademiaapi.servicelocator.networkModule
import com.example.myheroacademiaapi.servicelocator.repositoriesModule
import com.example.myheroacademiaapi.servicelocator.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin{
            androidContext(this@App)
            modules(viewModelModule, repositoriesModule, networkModule)
        }
    }
}