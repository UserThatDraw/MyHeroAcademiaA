package com.example.myheroacademiaapi.di

import com.example.myheroacademiaapi.api.HeroApi
import com.example.myheroacademiaapi.api.RetrofitClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Singleton
    val retrofitClient: RetrofitClient = RetrofitClient

    @Singleton
    @Provides
    fun fetchHero(): HeroApi {
        return retrofitClient.provideHeroApiService()
    }

}