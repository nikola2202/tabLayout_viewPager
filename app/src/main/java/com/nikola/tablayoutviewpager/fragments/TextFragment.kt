package com.nikola.tablayoutviewpager.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.nikola.tablayoutviewpager.R


class TextFragment : Fragment() {

    lateinit var tvTextFragment : TextView

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?
    {

        val view: View = inflater.inflate(R.layout.fragment_text, container, false)
        tvTextFragment = view.findViewById(R.id.tv_textFragment)

        val args = this.arguments
        val inputData = args?.get("data")
        tvTextFragment.text = inputData.toString()




        return view

    }

}