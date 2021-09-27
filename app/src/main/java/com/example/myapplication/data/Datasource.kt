package com.example.myapplication.data

import com.example.myapplication.R
import com.example.myapplication.model.Log

class Datasource {

    fun loadLogs() : List<Log> {
        return listOf<Log>(
            Log(R.string.kulhydrater, R.string.kulhydrater_unit),
            Log(R.string.kalorier, R.string.kulhydrater_unit),
            Log(R.string.ketoner, R.string.ketoner_unit)
        )
    }
}