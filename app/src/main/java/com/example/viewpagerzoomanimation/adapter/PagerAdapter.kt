package com.example.viewpagerzoomanimation.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.viewpager.widget.PagerAdapter

/**
 * Created by Efe Şen on 23,10,2024
 */
class PagerAdapter(private val colors: List<Int>, private val context: Context) : PagerAdapter() {


    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        // Create a new CardView programmatically
        val cardView = CardView(context).apply {
            layoutParams = ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
            )
            setCardBackgroundColor(colors[position])
            radius = 16f // Optional: Set corner radius for the CardView
            cardElevation = 8f // Optional: Set elevation for the CardView
        }

        // Add the card to the container
        container.addView(cardView)
        return cardView
    }

    override fun getCount() = colors.size

    override fun isViewFromObject(view: View, `object`: Any) = view == `object`

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }

}