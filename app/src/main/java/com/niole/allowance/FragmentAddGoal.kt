package com.niole.allowance

import android.os.Bundle
import android.support.v4.app.Fragment
import android.text.Editable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText

class FragmentAddGoal : Fragment() {

    companion object {
        fun newInstance(): Fragment {
            return FragmentAddGoal()
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedState: Bundle?): View? {
        super.onCreate(savedState)
        val view = inflater!!.inflate(R.layout.fragment_add_goal, container, false)

        view.findViewById<Button>(R.id.new_goal_submit).setOnClickListener { _ -> submitNewGoal(view) }

        return view
    }

    fun submitNewGoal(view: View) {
        val titleField = view.findViewById<EditText>(R.id.title)
        val descField = view.findViewById<EditText>(R.id.description)
        val frequencyField = view.findViewById<EditText>(R.id.frequency)
        val rewardField = view.findViewById<EditText>(R.id.reward)

        val title = titleField.text
        val description = descField.text
        val frequency = frequencyField.text
        val reward = rewardField.text

        print("SAVING" + title + description + frequency + reward)

        titleField.text.clear()
        descField.text.clear()
        frequencyField.text.clear()
        rewardField.text.clear()
    }
}

