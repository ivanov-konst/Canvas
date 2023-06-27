package com.example.canvas.data

import androidx.annotation.ColorRes
import com.example.canvas.R

enum class COLOR(
    @ColorRes
    val value: Int
) {

    BLACK(R.color.black),
    RED(R.color.red),
    BLUE(R.color.blue),
    GREEN(R.color.green),
    PINK(R.color.pink),
    YELLOW(R.color.yellow),
    GRAY(R.color.gray),
    ORANGE(R.color.orange),
    VIOLET(R.color.violet);



    companion object {
        private val map = values().associateBy(COLOR::value)
        fun from(color: Int) = map[color] ?: BLACK
    }
}