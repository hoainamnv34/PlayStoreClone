package com.example.playstore

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class GroupAdapter(private val itemList: List<Item>) : RecyclerView.Adapter<GroupAdapter.GroupViewHolder>()  {
    class GroupViewHolder(val row: View) : RecyclerView.ViewHolder(row) {
        var titleTV: TextView = row.findViewById(R.id.item_title)
        var img:ImageView = row.findViewById(R.id.item_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GroupViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false);
        return GroupViewHolder(layout)
    }

    override fun getItemCount(): Int {
        return  itemList.size;
    }

    override fun onBindViewHolder(holder: GroupViewHolder, position: Int) {
        holder.titleTV.text = itemList[position].title
        holder.img.setImageResource(itemList[position].img)
    }

}