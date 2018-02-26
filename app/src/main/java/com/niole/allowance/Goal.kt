package com.niole.allowance

import java.io.Serializable
import java.util.*

data class Goal(
        val isApproved: Boolean,
        val startDate: Date,
        val frequency: String,
        val title: String,
        val description: String,
        val allowance: Double,
        val guardianId: String,
        val wardId: String,
        val repeats: Boolean
) : Serializable
