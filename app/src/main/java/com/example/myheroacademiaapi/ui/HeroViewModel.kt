package com.example.myheroacademiaapi.ui

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.myheroacademiaapi.api.RetrofitClient
import com.example.myheroacademiaapi.base.BaseViewModel
import com.example.myheroacademiaapi.model.Hero
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class HeroViewModel : BaseViewModel() {
    val heroesList = MutableLiveData<List<Hero>>()

    fun getHeroes() {
        viewModelScope.launch(Dispatchers.IO) {
            RetrofitClient.provideHeroApiService().getHeroes().let {
                if (it.isSuccessful) {
                    heroesList.postValue(it.body()?.result)
                    Log.e("anime", "getHeroes: " + it)
                } else {
                    Log.e("anime", "Heroes Error ${it.code()}")
                }
            }
        }
    }
}

