package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class ListAdapter(private val mList: List<Item>) : RecyclerView.Adapter<com.example.myapplication.ListAdapter.ListHolder>() {

    class ListHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val nameItemView: TextView
        val priceItemView: TextView
        val urlItemView: TextView
        init{
            nameItemView = itemView.findViewById(R.id.displayname)
            priceItemView = itemView.findViewById(R.id.displayprice)
            urlItemView = itemView.findViewById(R.id.displayurl)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListHolder {
        val ctxt = parent.context
        val inflater = LayoutInflater.from(ctxt)
        val listView = inflater.inflate(R.layout.activity_item, parent, false)
        return ListHolder(listView)
    }

    override fun onBindViewHolder(holder: com.example.myapplication.ListAdapter.ListHolder, position: Int) {
        val m = mList.get(position)
        holder.nameItemView.text = m.name
        holder.priceItemView.text = m.price
        holder.urlItemView.text = m.url
    }

    override fun getItemCount(): Int {
        return mList.size
    }
}