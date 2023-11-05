package com.betty.playerstore

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.RecyclerView
import com.betty.playerstore.adapter.AppAdapter
import com.betty.playerstore.adapter.ListAppAdapter
import com.betty.playerstore.data.DataSource
import com.betty.playerstore.databinding.ActivityMainBinding
import com.betty.playerstore.databinding.ListAppBinding
import com.betty.playerstore.model.ListApp

class MainActivity : ComponentActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var listAppBinding: ListAppBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        listAppBinding = ListAppBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listAppSet: List<ListApp> = listOf(
            ListApp("Social App", DataSource().loadSocialApp()),
            ListApp("Popular App", DataSource().loadPopularApp()),
            ListApp("Game", DataSource().loadGame()),
            ListApp("Productivity App", DataSource().loadProductivityApp())
        )

        binding.listItemRecyclerView.adapter = ListAppAdapter(this, listAppSet);


    }
}
