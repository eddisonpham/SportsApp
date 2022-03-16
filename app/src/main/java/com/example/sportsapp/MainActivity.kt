package com.example.sportsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import android.widget.GridView

class MainActivity : AppCompatActivity() {
    private lateinit var gridView: GridView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var sportAdapter = SportAdapter(this@MainActivity)
        gridView.adapter = sportAdapter
    }
}