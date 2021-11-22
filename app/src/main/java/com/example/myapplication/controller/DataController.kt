package com.example.myapplication.controller

import com.example.myapplication.Activities.RecyclerFragment
import com.example.myapplication.model.Log

class DataController(val context: RecyclerFragment) {
    val logs = mutableListOf<Log>()

    fun createLog(logName: String, logUnit: String) {
        val newLog = Log(logName, logUnit)
        logs.add(newLog)
    }

    fun loadLogs(): MutableList<Log> {
        return logs
    }

    fun initLogs() {
        createLog("Blodsukker", "Milimol pr. Liter")
        createLog("Kulhydrater", "Gram")
        createLog("Kalorier", "Kcal")
    }

}