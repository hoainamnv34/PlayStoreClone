package com.example.playstore

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class AppAdapter(private val groupList: List<GroupItem>) : RecyclerView.Adapter<AppAdapter.AppViewHolder>()  {

    inner class AppViewHolder(val view: View): RecyclerView.ViewHolder(view){
        var titleTV: TextView = view.findViewById(R.id.group_title)

        fun bindRecyclerView(itemList: List<Item>){
            val recyclerView = view.findViewById<RecyclerView>(R.id.group_rv)
            val manager : RecyclerView.LayoutManager = LinearLayoutManager(view.context, LinearLayoutManager.HORIZONTAL, false)
            recyclerView.apply{
                var myAdapter = GroupAdapter(itemList)
                layoutManager = manager
                adapter = myAdapter
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AppViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.group_item, parent, false)
        return AppViewHolder(v)
    }

    override fun getItemCount(): Int {
        return groupList.size
    }

    override fun onBindViewHolder(holder: AppViewHolder, position: Int) {
        holder.titleTV.text = groupList[position].title
        holder.bindRecyclerView(groupList[position].data)

    }

}