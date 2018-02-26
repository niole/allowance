package com.niole.allowance

import android.content.Context
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import java.text.SimpleDateFormat

class MainTabsAdapter(fm: FragmentManager, private val context: Context) : FragmentPagerAdapter(fm) {
    private val date = "2018-02-02"

    private val sdf = SimpleDateFormat("yyyy-MM-dd")

    private val PAGE_COUNT = 3

    private val tabTitles = arrayOf("+", "G", "$")

    override fun getCount(): Int {
        return PAGE_COUNT
    }

    override fun getItem(position: Int): Fragment {
        var view: Fragment = showGoalView()
        if (position == 0) {
            view = showGoalView()
        }

        if (position == 1) {
            view = showGoalsListView()
        }

        if (position == 2) {
            view = showGoalView()
        }

        return view
    }

    private fun showGoalsListView(): Fragment {
        return GoalsListView.newInstance()
    }


    private fun showGoalView(): Fragment {
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
        return FragmentGoal.newInstance(goal)
    }


    override fun getPageTitle(position: Int): CharSequence {
        return tabTitles[position]
    }
}