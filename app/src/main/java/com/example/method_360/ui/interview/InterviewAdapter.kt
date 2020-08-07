package com.example.method_360.ui.interview

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.method_360.MainActivity
import com.example.method_360.R
import com.example.method_360.questions.QuestionActivity
import kotlinx.android.synthetic.main.item_interview.view.*

class InterviewAdapter(listArray: ArrayList<InterviewListItem>):RecyclerView.Adapter<InterviewAdapter.ViewHolder>() {
    var itemCounter = listArray
    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        var name_text = view.findViewById<TextView>(R.id.name_text)
        var position_text = view.findViewById<TextView>(R.id.position_text)
        var photo = view.findViewById<ImageView>(R.id.photo)
        var top_title = view.findViewById<TextView>(R.id.top_title)

        fun bind(listItem: InterviewListItem){
            name_text.text = listItem.name_text
            position_text.text = listItem.position_text
            photo.setImageResource(listItem.image_id)
            itemView.setOnClickListener {

            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater =  LayoutInflater.from(parent.context)
        return ViewHolder(
            inflater.inflate(
                R.layout.item_interview,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return itemCounter.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var listItem = itemCounter.get(position)
        holder.bind(listItem)
    }
}
