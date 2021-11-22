package com.example.myapplication.Activities

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.adapter.CustomAdapter
import com.example.myapplication.controller.DataController

class RecyclerFragment : Fragment() {
    public val dataController = DataController(this)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataController.initLogs()
        dataController.createLog("test1", "testunit1")
        dataController.createLog("test2", "testunit2")
        val recyclerView = requireView().findViewById<RecyclerView>(R.id.recycler_view)
        val dataSet = dataController.loadLogs()
        recyclerView.adapter = CustomAdapter(dataSet)

    }
}