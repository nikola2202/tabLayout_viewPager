package com.nikola.tablayoutviewpager.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.nikola.tablayoutviewpager.R
import com.nikola.tablayoutviewpager.adapters.Tab2Adapter

class Tab_2 : Fragment(R.layout.fragment_menu)
{
    var tab2title = arrayOf("Menu Fragment","Text Fragment")

    lateinit var tltab2: TabLayout
    lateinit var tab2pager: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View
    {
        val view: View = inflater.inflate(R.layout.fragment_tab_2, container, false)

        tltab2 = view.findViewById(R.id.tl_tab2)
        tab2pager = view.findViewById(R.id.vp_tab2)

        tab2pager.adapter = Tab2Adapter(childFragmentManager,lifecycle)


        TabLayoutMediator(tltab2,tab2pager)
        {
                tab,position ->
            tab.text = tab2title[position]
        }.attach()

        return view
    }
}