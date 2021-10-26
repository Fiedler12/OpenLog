package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.adapter.CustomAdapter
import com.example.myapplication.controller.DataController
import javax.sql.DataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val dataController = DataController(this)
        dataController.initLogs()
        dataController.createLog("test1", "testunit1")
        val dataSet = dataController.loadLogs()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = CustomAdapter(dataSet)
    }
}