package com.example.myheroacademiaapi.ui

import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myheroacademiaapi.ui.adapter.HeroAdapter
import com.example.myheroacademiaapi.base.BaseFragment
import com.example.myheroacademiaapi.databinding.FragmentHeroBinding

class HeroFragment : BaseFragment<FragmentHeroBinding>(FragmentHeroBinding::inflate) {

    private val viewModel: HeroViewModel by viewModels()

    override fun initM() {
        viewModel.heroesList.observe(viewLifecycleOwner, {
            binding.rvHero.layoutManager = LinearLayoutManager(requireContext())
            binding.rvHero.adapter = HeroAdapter(it)
        })
    }

    override fun setupView() {
        viewModel.getHeroes()
    }
}