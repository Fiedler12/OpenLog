package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val kulhydrater = Log("Kulhydrater")
        kulhydrater.lowerBound = 0
        val kalorier = Log("Kcal")
        kulhydrater.lowerBound = 0
        val ketoner = Log("Ketoner")
        ketoner.lowerBound = 0

        val logs = mutableListOf<Log>()
        logs.add(kulhydrater)
        logs.add(kalorier)
        logs.add(ketoner)
    }


    class Log constructor(unit: String){
        val values = mutableListOf<Int>()
        var upperBound: Int? = null
        var lowerBound: Int? = null
        val unit = unit
    }
}