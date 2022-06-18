package com.nikola.tablayoutviewpager.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.nikola.tablayoutviewpager.R
import com.nikola.tablayoutviewpager.ui.ClickHandler

class RVAdapter(
    val items: List<String>,
    val clickHandler: ClickHandler
    ): RecyclerView.Adapter<RVAdapter.ListViewHolder>()
{
    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener
    {
        val textView: TextView = itemView.findViewById(R.id.tv_element)

        init
        {
            itemView.setOnClickListener(this)
        }

        override fun onClick(p0: View?)
        {
            val position = adapterPosition
            if (position!=RecyclerView.NO_POSITION)
            {
                clickHandler.clickedItem(position)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder
    {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.row_layout,parent,false)

        return ListViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int)
    {
        val currentItem = items[position]
        holder.textView.text = currentItem

    }

    override fun getItemCount() = items.size

}