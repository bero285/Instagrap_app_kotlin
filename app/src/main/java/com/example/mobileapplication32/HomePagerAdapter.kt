package com.example.mobileapplication32

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.mobileapplication32.home.homeFragments.HomeMainFragment

class HomePagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> HomeMainFragment.newInstance()
            1 -> HomeMainFragment.newInstance()
            else -> throw IllegalStateException("Invalid position: $position")
        }
    }
}