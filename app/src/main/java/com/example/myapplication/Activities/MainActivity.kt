package com.example.myapplication.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageButton
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.adapter.CustomAdapter
import com.example.myapplication.controller.DataController

class MainActivity : AppCompatActivity() {
    val dataController = DataController(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initData()
        getMainPage()
        val createLogButton = findViewById<ImageButton>(R.id.imageView)
        createLogButton.setOnClickListener {
            val intent = Intent(this, NewLogActivity::class.java)
            startActivity(intent)
        }
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
}