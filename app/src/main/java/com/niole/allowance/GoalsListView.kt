package com.niole.allowance

import android.support.v4.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import java.text.SimpleDateFormat
import java.util.ArrayList

class GoalsListView : Fragment() {
    private val date = "2018-02-02"
    private val sdf = SimpleDateFormat("yyyy-MM-dd")
    private val goal = Goal(true, sdf.parse(date), "0000010", "go to the gym", "go the the gym and do some cardio", 0.50, "g", "w", true)

    private val goals: ArrayList<Goal> = ArrayList()

    private lateinit var arrayAdapter: ArrayAdapter<Goal>

    companion object {
        fun newInstance(): Fragment {
            return GoalsListView()
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedState: Bundle?): View? {
        super.onCreate(savedState)
        goals.addAll(listOf(
                goal,
                goal,
                goal,
                goal,
                goal,
                goal,
                goal,
                goal,
                goal,
                goal,
                goal,
                goal,
                goal,
                goal
        ))

        var view = activity.findViewById<ListView>(R.id.goal_list_view)
        if (view == null) {
            view = inflater!!.inflate(R.layout.goals_list_view, container, false) as ListView
        }

        arrayAdapter = GoalsListAdapter(activity, goals)

        view.setAdapter(arrayAdapter)

        return view
    }

}