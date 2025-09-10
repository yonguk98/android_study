package com.yongwook.nav_fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

class FirstFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_first, container, false)

        view.findViewById<Button>(R.id.btn2).setOnClickListener {
            Log.d("BTN TEST", "onCreateView: btn2 clicked")
            try {
                it.findNavController().navigate(R.id.action_firstFragment_to_secondFragment) // 실제 액션 ID로 변경
                Log.d("BTN TEST", "btn2 navigate call successful")
            } catch (e: Exception) {
                Log.e("BTN TEST", "Error navigating from btn1", e) // 예외 상세 로그 출력
            }
        }
        view.findViewById<Button>(R.id.btn3).setOnClickListener {
            Log.d("BTN TEST", "onCreateView: btn3")
            it.findNavController().navigate(R.id.action_firstFragment_to_thirdFragment)
        }

        return view
    }

}