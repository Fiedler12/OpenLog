package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.adapter.CustomAdapter
import com.example.myapplication.controller.DataController
import javax.sql.DataSource

class MainActivity : AppCompatActivity() {
    val dataController = DataController(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initData()
        getMainPage()
    }

    fun initData() {
        dataController.initLogs()
        dataController.createLog("test1", "testunit1")
        dataController.createLog("test2", "testunit2")
    }

    fun getMainPage() {
        setContentView(R.layout.activity_main)
        val dataSet = dataController.loadLogs()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = CustomAdapter(dataSet)
    }

    fun clickedCreateLog(view: android.view.View) {
        setContentView(R.layout.new_log)

    }
}