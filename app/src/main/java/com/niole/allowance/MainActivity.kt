package com.niole.allowance

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showGoalView()
     }

    private fun showGoalView() {
        val sFG = supportFragmentManager
        val goalView = FragmentGoal.newInstance()
        sFG.beginTransaction().add(R.id.main_container, goalView, "goalview").commit()
    }

}
