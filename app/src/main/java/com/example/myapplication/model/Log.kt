package com.example.myapplication.model

data class Log(val stringName: String, val stringMeasure : String) {
    val loggedValues = mutableListOf<LoggedValue>()


    fun addValue(addValue: LoggedValue) {
        loggedValues.add(addValue)
    }
}