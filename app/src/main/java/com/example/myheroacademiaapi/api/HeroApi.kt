package com.example.myheroacademiaapi.api

import com.example.myheroacademiaapi.model.Hero
import com.example.myheroacademiaapi.model.HeroesResponse
import com.example.myheroacademiaapi.utils.Constants.END_POINT
import retrofit2.Response
import retrofit2.http.GET

interface HeroApi {

    @GET(END_POINT)
    suspend fun getHeroes(): Response<HeroesResponse>
}