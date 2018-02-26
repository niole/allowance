package com.niole.allowance

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import java.text.SimpleDateFormat

class MainActivity : AppCompatActivity() {
    private val date = "2018-02-02"
    private val sdf = SimpleDateFormat("yyyy-MM-dd")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //showGoalView()
        showGoalsListView()
     }

    private fun showGoalsListView() {
        val sFG = supportFragmentManager
        val goalView: Fragment = GoalsListView.newInstance()

        sFG.beginTransaction().add(R.id.main_container, goalView, "goalslistview").commit()
    }


    private fun showGoalView() {
        val sFG = supportFragmentManager
        val goal = Goal(
                true,
                sdf.parse(date),
                "0000010",
                "go to the gym",
                "go the the gym and do some cardio",
                0.50,
                "g",
                "w",
                true
        )
        val goalView = FragmentGoal.newInstance(goal)
        sFG.beginTransaction().add(R.id.main_container, goalView, "goalview").commit()
    }

}
