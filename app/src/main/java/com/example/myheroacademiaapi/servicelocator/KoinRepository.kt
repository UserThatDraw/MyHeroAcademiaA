package com.example.myheroacademiaapi.servicelocator

import com.example.myheroacademiaapi.api.HeroApi
import com.example.myheroacademiaapi.data.db.daos.HeroDao

class KoinRepository(
    private val heroApiService: HeroApi,
    private val heroDao : HeroDao
) {

}
