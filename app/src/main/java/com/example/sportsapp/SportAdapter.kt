package com.example.sportsapp

import android.content.Context
import android.content.Intent
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import org.w3c.dom.Text

class SportAdapter: BaseAdapter {
    private var context: Context? = null
    private var sportDatabase: SportDatabase? = null
    constructor(context: Context){
        sportDatabase = SportDatabase()
        this.context = context
    }
    override fun getCount(): Int {
        return sportDatabase?.sports?.size ?: 0
    }

    override fun getItem(index: Int): Any {
        return sportDatabase?.sports?.get(index)
            ?: Sport("No Name", "No Detail",R.drawable.placeholder)
    }

    override fun getItemId(index: Int): Long {
        return index.toLong()
    }

    override fun getView(index: Int, convertView: View?, parent: ViewGroup?): View {
        var sport: Sport = sportDatabase?.sports?.get(index)
            ?: Sport("No Name", "No Detail", R.drawable.placeholder)
        var inflater = context?.getSystemService(
            Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        var sportItem = inflater.inflate(R.layout.sport_items, null)
        var sportImage: ImageView = sportItem.findViewById(R.id.sportImage)
        var sportName: TextView = sportItem.findViewById(R.id.sportName)
        sportImage.setImageResource(sport.sportImage ?: R.drawable.placeholder)
        sportName.setText(sport.sportName)

        sportItem.setOnClickListener {

            val detailIntent = Intent(context, SportDetailActivity::class.java)
            detailIntent.putExtra("image", sport.sportImage)
            detailIntent.putExtra("detail", sport.sportDetail)
            ContextCompat.startActivity(context!!, detailIntent, null)
        }
        return sportItem
    }

}