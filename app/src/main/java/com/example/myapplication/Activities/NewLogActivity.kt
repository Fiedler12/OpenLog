package com.example.myapplication.Activities

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R

class NewLogActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.new_log)
        //actionbar
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "Create new Log"
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}