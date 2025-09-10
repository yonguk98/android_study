package com.yongwook.goodwords

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class SentenceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sentence)

        val sentenceList = mutableListOf<String>()
        sentenceList.add("명언1")
        sentenceList.add("명언2")
        sentenceList.add("명언3")
        sentenceList.add("명언4")
        sentenceList.add("결점이 없는 친구를 사귀려고 한다면 평생 친구를 가질 수 없을 거이다.")
        sentenceList.add("사람에게 하나의 입과  두 개의 귀가 있다는 것은 말하기보다 듣기를 두 배로 하라는 뜻이다.")

        val sentenceAdapter = ListViewAdapter(sentenceList)
        val listview = findViewById<ListView>(R.id.sectenceListView)

        listview.adapter = sentenceAdapter

    }
}