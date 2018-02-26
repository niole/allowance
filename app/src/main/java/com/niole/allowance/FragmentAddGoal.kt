package com.niole.allowance

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class FragmentAddGoal : Fragment() {

    companion object {
        fun newInstance(): Fragment {
            return FragmentAddGoal()
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedState: Bundle?): View? {
        super.onCreate(savedState)
        return inflater!!.inflate(R.layout.fragment_add_goal, container, false)
    }
}

