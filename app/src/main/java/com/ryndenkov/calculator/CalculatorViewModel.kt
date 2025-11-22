package com.ryndenkov.calculator

import androidx.compose.runtime.mutableStateOf

class CalculatorViewModel {

    val state = mutableStateOf(
        Display(
            expression = "45x8",
            result = "360"
        )
    )

    fun processUserInfo(input: String) {
        when (input) {
            "AC" -> state.value = Display("", "")
            "1" -> state.value = Display("1", "")
            "2" -> state.value = Display("2", "")
        }
    }
}

data class Display(
    val expression: String,
    val result: String
)