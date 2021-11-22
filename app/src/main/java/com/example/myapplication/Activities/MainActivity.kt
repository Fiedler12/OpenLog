package com.example.myapplication.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.adapter.CustomAdapter
import com.example.myapplication.controller.DataController

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val createLogButton = findViewById<ImageButton>(R.id.imageView)
        createLogButton.setOnClickListener {
            val intent = Intent(this, NewLogActivity::class.java)
            startActivity(intent)
        }
    }
}