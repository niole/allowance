package com.niole.allowance

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.niole.allowance.databinding.FragmentGoalBinding


class FragmentGoal : Fragment() {
    companion object {
        fun newInstance(goal: Goal): FragmentGoal {
            val args = Bundle()
            args.putSerializable("goal", goal)

            val view = FragmentGoal()
            view.setArguments(args)

            return view
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedState: Bundle?): View? {
        super.onCreate(savedState)

        val goal: Goal? = savedState?.getSerializable("goal") as Goal

        val fragmentGoalBinding = FragmentGoalBinding.inflate(inflater!!,
                container, false)

        if (goal != null) {
            fragmentGoalBinding.goal = goal
        }

        return fragmentGoalBinding.root
    }

}