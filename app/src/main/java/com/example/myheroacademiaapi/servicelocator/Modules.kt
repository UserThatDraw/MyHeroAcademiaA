package com.example.myheroacademiaapi.servicelocator

import com.example.myheroacademiaapi.api.RetrofitClient
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { KoinViewModel(get()) }
}

val repositoriesModule = module {
    factory { KoinRepository(get(), get()) }
}

val networkModule = module {
    single { RetrofitClient }
    single { get <RetrofitClient>().provideHeroApiService() }
}