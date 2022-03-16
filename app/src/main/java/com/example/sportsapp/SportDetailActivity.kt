package com.example.sportsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class SportDetailActivity : AppCompatActivity() {

    private lateinit var detailImage: ImageView
    private lateinit var detailText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sport_detail)

        detailImage = findViewById(R.id.detailImage)
        detailText = findViewById(R.id.detailText)

        val receivedData = intent.extras
        val sportImage = receivedData!!.getInt("image")
        val sportDetail = receivedData!!.getString("detail")

        detailImage.setImageResource(sportImage)
        detailText.text = sportDetail
    }
}