package com.example.myapplication.controller

import com.example.myapplication.model.Log
import java.lang.Exception
import java.lang.reflect.Field

class DataController {
    val logs = mutableListOf<Log>()

    fun createLog(logName : String, logUnit : String) {
        val newLog = Log(logName, logUnit)
    }

    fun loadLogs() : List<Log> {
        return logs
    }




}