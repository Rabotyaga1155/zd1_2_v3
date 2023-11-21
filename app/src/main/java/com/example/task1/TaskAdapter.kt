package com.example.task1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class TaskAdapter(context: Context, tasks: List<String>) :
    ArrayAdapter<String>(context, R.layout.list_item_task, tasks) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val task = getItem(position) ?: ""
        val view = convertView ?: LayoutInflater.from(context).inflate(R.layout.list_item_task, parent, false)

        val textViewTask: TextView = view.findViewById(R.id.textViewTask)
        textViewTask.text = task

        return view
    }
}