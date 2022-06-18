package com.nikola.tablayoutviewpager.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.nikola.tablayoutviewpager.fragments.Napredni_Tab
import com.nikola.tablayoutviewpager.fragments.Tab_1
import com.nikola.tablayoutviewpager.fragments.Tab_2

class MainAdapter(fragmentManager: FragmentManager,lifecycle: Lifecycle)
    : FragmentStateAdapter(fragmentManager,lifecycle)
{
    override fun getItemCount(): Int
    {
        return 3
    }

    override fun createFragment(position: Int): Fragment
    {
        when(position)
        {
            0 -> return Tab_1()
            1 -> return Tab_2()
            2 -> return Napredni_Tab()
            else -> return Tab_1()
        }
    }
}