package com.yongwook.trot_list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Singer3Fragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_singer3, container, false)

        val items = mutableListOf<String>()
        items.add("가인 노래 1")
        items.add("가인 노래 2")
        items.add("가인 노래 3")
        items.add("가인 노래 4")
        items.add("가인 노래 5")
        items.add("가인 노래 6")
        items.add("가인 노래 7")
        items.add("가인 노래 8")
        items.add("가인 노래 9")
        items.add("가인 노래 10")
        items.add("가인 노래 11")
        items.add("가인 노래 12")
        items.add("가인 노래 13")
        items.add("가인 노래 14")


        val rv = view.findViewById<RecyclerView>(R.id.singRV)
        rv.adapter = RVAdapter(items)
        rv.layoutManager = LinearLayoutManager(context)
        
        view.findViewById<ImageView>(R.id.image1).setOnClickListener {
            it.findNavController().navigate(R.id.action_singer3Fragment_to_singer1Fragment)
        }

        view.findViewById<ImageView>(R.id.image2).setOnClickListener {
            it.findNavController().navigate(R.id.action_singer3Fragment_to_singer2Fragment)
        }

        return view
    }

}