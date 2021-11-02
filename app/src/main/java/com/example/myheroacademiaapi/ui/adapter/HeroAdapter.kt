package com.example.myheroacademiaapi.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.myheroacademiaapi.databinding.HeroItemBinding
import com.example.myheroacademiaapi.model.Hero

class HeroAdapter (private var list: List<Hero>) : RecyclerView.Adapter<HeroAdapter.ViewHolder>() {

    inner class ViewHolder(private val binding: HeroItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(model: Hero) {
            binding.heroItemName.text = model.name.toString()
            binding.heroItemHeroName.text = model.alias.toString()
            binding.heroItemQuirk.text = model.quirk.toString()
            binding.heroItemImage.load(model.images?.get(0).toString()) {
                crossfade(true)
                crossfade(1000)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            HeroItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.onBind(list[position])

    override fun getItemCount(): Int = list.size
}
