package com.nikola.tablayoutviewpager

import         androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.nikola.tablayoutviewpager.adapters.MainAdapter
import com.nikola.tablayoutviewpager.adapters.Tab2Adapter

class MainActivity : AppCompatActivity() {

    var tabTitle = arrayOf("Tab 1","Tab 2","Napredni tab")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pager = findViewById<ViewPager2>(R.id.viewPager2)
        val tl = findViewById<TabLayout>(R.id.tabLayout)

        pager.adapter = MainAdapter(supportFragmentManager,lifecycle)

        TabLayoutMediator(tl,pager)
        {
            tab,position ->
                 tab.text = tabTitle[position]
        }.attach()

    }

    fun submitText(view: android.view.View)
    {

    }
}