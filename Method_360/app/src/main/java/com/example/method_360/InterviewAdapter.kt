package com.example.method_360

import android.app.LauncherActivity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import java.util.zip.Inflater

class InterviewAdapter (listArray: ArrayList<InterviewListItem>, context: Context):RecyclerView.Adapter<InterviewAdapter.ViewHolder>() {
    var itemCounter = listArray
    var contextItemRecycle = context
    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        var name_text = view.findViewById<TextView>(R.id.name_text)
        var position_text = view.findViewById<TextView>(R.id.position_text)
        var photo = view.findViewById<ImageView>(R.id.photo)

        fun bind(listItem:InterviewListItem, context: Context){
            name_text.text = listItem.name_text
            position_text.text = listItem.position_text
            photo.setImageResource(listItem.image_id)
            itemView.setOnClickListener(){
                Toast.makeText(context, "pressed: ${name_text.text}",Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater =  LayoutInflater.from(contextItemRecycle)
        return ViewHolder(inflater.inflate(R.layout.interview_item, parent, false))
    }

    override fun getItemCount(): Int {
        return itemCounter.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var listItem = itemCounter.get(position)
        holder.bind(listItem, contextItemRecycle)
    }

}