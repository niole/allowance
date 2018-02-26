package com.niole.allowance

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.niole.allowance.databinding.FragmentGoalListRowBinding

class GoalsListAdapter(fragContext: Context, private val goals: ArrayList<Goal>): ArrayAdapter<Goal>(fragContext, 0, goals) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var view = convertView
        val inflater = LayoutInflater.from(context)
        val goal = getItem(position)

        if (view == null) {
            view = inflater.inflate(R.layout.fragment_goal_list_row, parent, false)
        }

        val fragmentGoalBinding = FragmentGoalListRowBinding.inflate(inflater, parent, false)

        fragmentGoalBinding.goal = goal

        return fragmentGoalBinding.root
    }

    override fun getItem(i: Int): Goal {
        return goals[i]
    }

    override fun getItemId(i: Int): Long {
        return i.toLong()
    }

    override fun getCount(): Int {
        return goals.size
    }
}
