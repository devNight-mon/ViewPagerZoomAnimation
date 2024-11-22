package com.example.viewpagerzoomanimation

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast


class ColorFragment : Fragment() {
    private var color: Int = Color.WHITE

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_color, container, false)
        view.setBackgroundColor(color)
        return view
    }


    companion object {
        fun newInstance(color: Int): ColorFragment {
            val fragment = ColorFragment()
            fragment.color = color
            return fragment
        }
    }
}