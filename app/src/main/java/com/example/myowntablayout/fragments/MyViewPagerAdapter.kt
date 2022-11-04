package com.example.myowntablayout.fragments

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class MyViewPagerAdapter(holderFragment: HolderFragment) : FragmentStateAdapter(holderFragment) {

    private val list = listOf(FirstFragment(),SecondFragment(),ThirdFragment())

    override fun getItemCount(): Int {
        return list.size
    }

    override fun createFragment(position: Int): Fragment {
       return list[position]
    }

}
