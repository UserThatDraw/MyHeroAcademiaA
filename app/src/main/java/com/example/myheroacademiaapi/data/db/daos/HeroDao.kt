package com.example.myheroacademiaapi.data.db.daos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.myheroacademiaapi.model.Hero

@Dao
interface HeroDao {
    @Query("SELECT * FROM hero ORDER BY id DESC")
    fun getHeroes(): List<Hero>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(hero: List<Hero>)

    @Query("DELETE FROM hero")
    suspend fun clear()
}