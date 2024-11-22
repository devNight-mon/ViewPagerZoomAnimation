package com.example.viewpagerzoomanimation.adapter

import android.graphics.Color
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.viewpagerzoomanimation.ColorFragment

/**
 * Created by Efe Şen on 24,10,2024
 */
class ColorPagerAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {
    private val colors = listOf(
        Color.RED,
        Color.BLUE,
        Color.GREEN,
        Color.YELLOW,
        Color.MAGENTA
    )

    override fun getItemCount(): Int = colors.size

    override fun createFragment(position: Int): Fragment {
        return ColorFragment.newInstance(colors[position])
    }
}