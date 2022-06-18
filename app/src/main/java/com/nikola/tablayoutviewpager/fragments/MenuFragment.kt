package com.nikola.tablayoutviewpager.fragments

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.nikola.tablayoutviewpager.R
import com.nikola.tablayoutviewpager.adapters.RVAdapter
import com.nikola.tablayoutviewpager.ui.ClickHandler
import kotlinx.android.synthetic.main.bottom_sheet_dialog.*
import kotlinx.android.synthetic.main.row_layout.*


class MenuFragment : Fragment(), ClickHandler{

    lateinit var recyclerView: RecyclerView
    lateinit var adapter: RVAdapter
    private val generatedList = generateList(10)

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?
    {
        val view :View =  inflater.inflate(R.layout.fragment_menu, container, false)

        recyclerView = view.findViewById(R.id.recycler_view)

        adapter = RVAdapter(generatedList,this)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = adapter
        adapter.notifyDataSetChanged()

        return view
    }

    private fun generateList(size: Int): List<String>
    {
        val list = mutableListOf<String>()

        for (i in 0 until size) {

            val item = "Element ${i+1}"

            list += item

        }

        return list

    }

    override fun clickedItem(position: Int)
    {

        val clicked = generatedList[position]
        tv_element.text = clicked

        val bundle = Bundle()
        bundle.putString("data",clicked)

        val fragment = TextFragment()
        fragment.arguments = bundle
        childFragmentManager.beginTransaction().replace(R.id.fragment_tab_2,fragment).commit()

    }

}