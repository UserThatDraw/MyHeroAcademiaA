package com.example.myheroacademiaapi.model

data class Hero(
    val birthday: Any? = null,
    val images: List<String?>? = null,
    val occupation: String? = null,
    val gender: Any? = null,
    val teams: Any? = null,
    val kanji: String? = null,
    val romaji: String? = null,
    val description: String? = null,
    val eye: Any? = null,
    val quirk: Any? = null,
    val bloodtype: Any? = null,
    val hair: Any? = null,
    val fightstyle: Any? = null,
    val epithet: Any? = null,
    val affiliation: Any? = null,
    val name: Any? = null,
    val alias: Any? = null,
    val ages: Any? = null,
    val id: String? = null,
    val family: Any? = null,
    val height: Any? = null,
    val status: String? = null
)

data class InfoHeroes(
    val currentPage: Int,
    val count: Int,
    val pages: Int
)

data class HeroesResponse(
    val info: InfoHeroes,
    val result: List<Hero>
)