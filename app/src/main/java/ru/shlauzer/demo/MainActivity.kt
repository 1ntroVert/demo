package ru.shlauzer.demo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {

    lateinit var pager: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pager = findViewById(R.id.pager)
        val pagerAdapter = ViewPagerAdapter(this)
        pager.adapter = pagerAdapter
    }
}