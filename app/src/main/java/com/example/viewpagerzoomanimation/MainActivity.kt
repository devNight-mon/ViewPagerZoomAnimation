package com.example.viewpagerzoomanimation

import android.graphics.Color
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.viewpagerzoomanimation.adapter.PagerAdapter
import com.example.viewpagerzoomanimation.databinding.ActivityMainBinding
import com.example.viewpagerzoomanimation.utils.AlphaAndScalePageTransformer

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        // Inflate the layout using ViewBinding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Define a list of colors to be used for the CardViews
        val colors = listOf(
            Color.RED,
            Color.BLUE,
            Color.GREEN,
            Color.YELLOW,
            Color.MAGENTA
        )
        // Set up the adapter with the color list
        val adapter = PagerAdapter(colors, this)
        binding.cardViewPager.offscreenPageLimit = 3
        binding.cardViewPager.pageMargin = 40
        binding.cardViewPager.setPageTransformer(true, AlphaAndScalePageTransformer())
        binding.cardViewPager.adapter = adapter

    }
}
