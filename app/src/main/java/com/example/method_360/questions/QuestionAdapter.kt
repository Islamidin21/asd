package com.example.method_360.questions

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.SeekBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.method_360.R
import com.example.method_360.ui.interview.InterviewAdapter
import com.example.method_360.ui.interview.InterviewListItem
import kotlinx.android.synthetic.main.item_question.view.*

class QuestionAdapter(listArray: ArrayList<QuestionListItem>):RecyclerView.Adapter<QuestionAdapter.ViewHolder>(){
    var item = listArray

    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        fun bind(listItem: QuestionListItem) {
            question.text = listItem.question
            qCounter.text = listItem.qCount.toString()


        }

        var question = view.findViewById<TextView>(R.id.question)
        var qCounter = view.findViewById<TextView>(R.id.question_counter)
        var mark = view.findViewById<SeekBar>(R.id.question_mark)

    }

    fun bind (listItem: QuestionListItem){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuestionAdapter.ViewHolder {
        val inflater =  LayoutInflater.from(parent.context)
        return QuestionAdapter.ViewHolder(
            inflater.inflate(
                R.layout.item_interview,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return item.size
    }

    override fun onBindViewHolder(holder: QuestionAdapter.ViewHolder, position: Int) {
        var listItem = item.get(position)
        holder.bind(listItem)
    }

}