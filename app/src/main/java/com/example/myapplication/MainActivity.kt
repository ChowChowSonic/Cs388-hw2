package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ScrollView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    val list: MutableList<Item> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<RecyclerView>(R.id.view).adapter =  ListAdapter(list)
        findViewById<RecyclerView>(R.id.view).layoutManager = LinearLayoutManager(this)
        findViewById<Button>(R.id.button).setOnClickListener {
            val url: String = findViewById<TextInputEditText>(R.id.URL).text.toString()
            val name: String = findViewById<TextInputEditText>(R.id.item_name).text.toString()
            val price: String = findViewById<TextInputEditText>(R.id.price).text.toString()
            list.add(Item(name, price, url))
            findViewById<TextInputEditText>(R.id.URL).setText("")
            findViewById<TextInputEditText>(R.id.item_name).setText("")
            findViewById<TextInputEditText>(R.id.price).setText("")
            println(list.size)
        }
    }
}