package com.example.davalebaviewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class pageAdapter(fm:FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> {return fragment1()}
            1 -> {return Fragment2()}
            2 -> {return Fragment3 ()}
            else -> {return fragment1()}


        }
    }
}