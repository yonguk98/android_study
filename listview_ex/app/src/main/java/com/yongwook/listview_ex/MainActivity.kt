package com.yongwook.listview_ex

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list_item = mutableListOf<String>()
        val list_item2 = mutableListOf<ListViewModel>()

        list_item2.add(ListViewModel("a","b"))
        list_item2.add(ListViewModel("c","d"))
        list_item2.add(ListViewModel("e","f"))

        list_item.add("A")
        list_item.add("B")
        list_item.add("C")

        val listview = findViewById<ListView>(R.id.maindListview)

        val listAdapter = ListViewAdapter(list_item)

        val listAdapter2 = ListViewAdapter2(list_item2)

        listview.adapter = listAdapter2

    }
}