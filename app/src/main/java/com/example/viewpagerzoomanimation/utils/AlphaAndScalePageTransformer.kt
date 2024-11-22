package com.example.viewpagerzoomanimation.utils

import android.view.View
import androidx.viewpager.widget.ViewPager

/**
 * Created by Efe Şen on 23,10,2024
 */
class AlphaAndScalePageTransformer: ViewPager.PageTransformer  {

    private val scaleMax = 0.8f
    private val alphaMax = 0.5f

    override fun transformPage(page: View, position: Float) {
       val scale = if (position < 0) {
           (1- scaleMax) * position + 1

       } else {
           (scaleMax - 1) * position + 1
       }
        val alpha = if (position < 0) {
            (1 - alphaMax) * position + 1
        } else {
            (alphaMax - 1) * position + 1
        }

        if (position < 0) {
            page.pivotX = page.width.toFloat()
            page.pivotY = (page.height / 2).toFloat()
        } else {
            page.pivotX = 0f
            page.pivotY = (page.height / 2).toFloat()
        }

        page.scaleX = scale
        page.scaleY = scale
        page.alpha = kotlin.math.abs(alpha)
    }
}