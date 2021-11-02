package com.example.myheroacademiaapi.data.converter

import android.media.Image
import android.media.Rating
import android.net.Network
import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class Converter {

    private inline fun <reified T> typeToken() = object : TypeToken<T>() {}.type
    private inline fun <reified T> fromJson(value: String?) =
        Gson().fromJson<T>(value, typeToken<T>())

    private inline fun <reified T> toJson(generic: T) = Gson().toJson(generic, typeToken<T>())

    @TypeConverter
    fun fromImage(value: String?) = fromJson<Image?>(value)

    @TypeConverter
    fun imageToJson(image: Image?) = toJson(image)

    @TypeConverter
    fun fromRating(value: String?) = fromJson<Rating>(value)

    @TypeConverter
    fun ratingToJson(rating: Rating?) = toJson(rating)

    @TypeConverter
    fun fromNetwork(value: String?) = fromJson<Network>(value)

    @TypeConverter
    fun networkToJson(network: Network?) = toJson(network)

    @TypeConverter
    fun listFrom(value: String?) = fromJson<List<String>>(value)

    @TypeConverter
    fun listToJson(list: List<String>) = toJson(list)

}