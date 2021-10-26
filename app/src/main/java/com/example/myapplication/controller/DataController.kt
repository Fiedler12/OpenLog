package com.example.myapplication.controller

import android.content.Context
import com.example.myapplication.model.Log
import java.lang.Exception
import java.lang.reflect.Field

class DataController(val context: Context) {
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