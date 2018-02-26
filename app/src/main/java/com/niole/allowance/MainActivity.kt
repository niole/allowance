package com.niole.allowance

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val viewPager = findViewById<ViewPager>(R.id.viewpager)

        viewPager.adapter = MainTabsAdapter(supportFragmentManager, this)

        val tabLayout = findViewById<TabLayout>(R.id.sliding_tabs)

        tabLayout.setupWithViewPager(viewPager)

     }
}
