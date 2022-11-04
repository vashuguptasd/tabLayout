package com.example.myowntablayout.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myowntablayout.R
import com.example.myowntablayout.databinding.FragmentHolderBinding

class HolderFragment : Fragment() {
    private lateinit var binding : FragmentHolderBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentHolderBinding.inflate(layoutInflater)



        binding.apply {

            val viewPager = viewPager
            val adapter = MyViewPagerAdapter(this@HolderFragment)

            val tabLayout = tabLayout
            
            viewPager.adapter = adapter






        }








        return binding.root
    }

}