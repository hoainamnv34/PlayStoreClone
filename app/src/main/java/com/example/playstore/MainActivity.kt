package com.example.playstore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var itemList: List<Item>;
    private lateinit var groupItem: List<GroupItem>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        itemList = ArrayList<Item>();
        itemList = itemList + Item("FaceBook", R.drawable.facebook);
        itemList = itemList + Item("Instagram", R.drawable.instagram);
        itemList = itemList + Item("Tiktok", R.drawable.tiktok);
        itemList = itemList + Item("Message", R.drawable.facebook_messenger);
        itemList = itemList + Item("Whatsapp", R.drawable.whatsapp);


        groupItem = ArrayList<GroupItem>();

        groupItem = groupItem + GroupItem("Recommended for you", itemList)
        groupItem = groupItem + GroupItem("Suggested for you", itemList)
        groupItem = groupItem + GroupItem("Share photos & videos", itemList)


        val rv: RecyclerView = findViewById(R.id.app_rv)
        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter = AppAdapter(groupItem)
    }
}