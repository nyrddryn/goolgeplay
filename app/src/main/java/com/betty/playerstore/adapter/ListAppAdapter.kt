package com.betty.playerstore.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.betty.playerstore.R
import com.betty.playerstore.model.App
import com.betty.playerstore.model.ListApp

class ListAppAdapter(private var context: Context, private var dataset: List<ListApp>)
    : RecyclerView.Adapter<ListAppViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListAppViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_app, parent, false)

        return ListAppViewHolder(adapterLayout)
    }

    override fun getItemCount() = dataset.size

    override fun onBindViewHolder(holder: ListAppViewHolder, position: Int) {
        val item = dataset[position]
        holder.listName.text = item.category
        holder.listApp.adapter = AppAdapter(context, item.list)
        holder.listApp.setHasFixedSize(true)
    }
}

class ListAppViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
    var listName = view.findViewById<TextView>(R.id.list_app_category)
    var listApp = view.findViewById<RecyclerView>(R.id.list_app_recycler_view)
}