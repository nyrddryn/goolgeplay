package com.betty.playerstore.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.betty.playerstore.R
import com.betty.playerstore.model.App

class AppAdapter(private var context: Context, private var dataset: List<App>) :
    RecyclerView.Adapter<AppViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AppViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.app, parent, false)

        return AppViewHolder(adapterLayout)
    }

    override fun getItemCount() = dataset.size;

    override fun onBindViewHolder(holder: AppViewHolder, position: Int) {
        val item = dataset[position]
        holder.appName.text = item.name
        holder.appRating.text = item.rating.toString()
    }

}

class AppViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
    val appName = view.findViewById<TextView>(R.id.app_name)
    var appRating = view.findViewById<TextView>(R.id.app_rating)
}