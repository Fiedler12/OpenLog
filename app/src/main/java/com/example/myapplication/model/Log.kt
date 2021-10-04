package com.example.myapplication.model

data class Log(val stringNameId: Int, val stringMeasureId: Int){
    val loggedValues = mutableListOf<LoggedValue>()


    fun addValue(addValue: LoggedValue) {
        loggedValues.add(addValue)
    }
}