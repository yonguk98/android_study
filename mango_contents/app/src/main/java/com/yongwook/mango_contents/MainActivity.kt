package com.yongwook.mango_contents

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val items = mutableListOf<ContentsModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bookmarkBtn = findViewById<TextView>(R.id.bookmarkBtn)
        bookmarkBtn.setOnClickListener {

            val intent = Intent(this, BookmarkActivity::class.java)
            startActivity(intent)
        }

        items.add(
            ContentsModel(
                "https://www.siksinhot.com/P/56310",
                "https://img.siksinhot.com/place/1458027947166169.webp",
                "강남교자"
            )
        )

        items.add(
            ContentsModel(
                "https://www.siksinhot.com/P/343390",
                "https://img.siksinhot.com/place/1462951929604739.png",
                "도치피자"
            )
        )

        items.add(
            ContentsModel(
                "https://www.siksinhot.com/P/36923",
                "https://img.siksinhot.com/place/1528429320949009.webp",
                "시골야채된장"
            )
        )

        items.add(
            ContentsModel(
                "https://www.siksinhot.com/P/36923",
                "https://img.siksinhot.com/place/1528429320949009.webp",
                "시골야채된장"
            )
        )

        items.add(
            ContentsModel(
                "https://www.siksinhot.com/P/56310",
                "https://img.siksinhot.com/place/1458027947166169.webp",
                "강남교자"
            )
        )

        items.add(
            ContentsModel(
                "https://www.siksinhot.com/P/343390",
                "https://img.siksinhot.com/place/1462951929604739.png",
                "도치피자"
            )
        )

        items.add(
            ContentsModel(
                "https://www.siksinhot.com/P/36923",
                "https://img.siksinhot.com/place/1528429320949009.webp",
                "시골야채된장"
            )
        )

        items.add(
            ContentsModel(
                "https://www.siksinhot.com/P/36923",
                "https://img.siksinhot.com/place/1528429320949009.webp",
                "시골야채된장"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv)
        val rvAdapter = RVAdapter(items, baseContext)
        recyclerView.adapter = rvAdapter

        rvAdapter.itemClick = object : RVAdapter.ItemClick{
            override fun onClick(view: View, position: Int) {
                val intent = Intent(baseContext, ViewActivity::class.java)
                intent.putExtra("url", items[position].url)
                intent.putExtra("title", items[position].titleText)
                intent.putExtra("imageUrl", items[position].titleImageUrl)
                startActivity(intent)
            }
        }

        recyclerView.layoutManager = GridLayoutManager(this,2)

    }
}