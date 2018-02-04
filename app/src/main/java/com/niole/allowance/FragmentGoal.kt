package com.niole.allowance

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.niole.allowance.databinding.FragmentGoalBinding
import java.text.SimpleDateFormat


class FragmentGoal : Fragment() {
    companion object {
        fun newInstance(): FragmentGoal {
            return FragmentGoal()
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedState: Bundle?): View? {
        super.onCreate(savedState)
        val fragmentGoalBinding = FragmentGoalBinding.inflate(inflater!!,
                container, false)
        val goal = getGoal(fragmentGoalBinding.root)
        fragmentGoalBinding.goal = goal
        return fragmentGoalBinding.root
    }

    private fun getGoal(view: View): Goal {
        val date = "2018-02-02"
        val sdf = SimpleDateFormat("yyyy-MM-dd")

        view.findViewById<TextView>(R.id.goal_duedate).text = sdf.parse(date).toString()

        return Goal(
                isApproved = true,
                startDate = sdf.parse(date),
                frequency = "0000010",
                title = "go to the gym",
                description = "go the the gym and do some cardio",
                allowance = 0.50,
                guardianId = "g",
                wardId = "w",
                repeats = true
        )
    }

}