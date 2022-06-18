package com.nikola.tablayoutviewpager.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.nikola.tablayoutviewpager.fragments.*

class Tab2Adapter(fragmentManager: FragmentManager, lifecycle: Lifecycle)
    : FragmentStateAdapter(fragmentManager,lifecycle)
{
    override fun getItemCount(): Int
    {
        return 2
    }

    override fun createFragment(position: Int): Fragment
    {
        when(position)
        {
            0 -> return MenuFragment()
            1 -> return TextFragment()
            else -> return MenuFragment()
        }
    }

}