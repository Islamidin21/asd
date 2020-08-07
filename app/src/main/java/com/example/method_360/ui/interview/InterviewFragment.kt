package com.example.method_360.ui.interview

import android.annotation.SuppressLint
import android.content.Intent
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.ContentView
import androidx.core.view.get
import androidx.lifecycle.Observer
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.method_360.R
import com.example.method_360.questions.QuestionActivity
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.fragment_interview_list.*
import kotlinx.android.synthetic.main.fragment_profile.*
import kotlinx.android.synthetic.main.item_question.*

class InterviewFragment : Fragment() {

    private lateinit var interviewViewModel: InterviewViewModel
    var adapter:InterviewAdapter =
        InterviewAdapter(arrayListOf(
            InterviewListItem(R.drawable.ic_profile,"Name","Position"),
            InterviewListItem(R.drawable.ic_profile,"Name","Position"),
            InterviewListItem(R.drawable.ic_profile,"Name","Position"),
            InterviewListItem(R.drawable.ic_profile,"Name","Position"),
            InterviewListItem(R.drawable.ic_profile,"Name","Position"),
            InterviewListItem(R.drawable.ic_profile,"Name","Position"),
            InterviewListItem(R.drawable.ic_profile,"Name","Position"),
            InterviewListItem(R.drawable.ic_profile,"Name","Position"),
            InterviewListItem(R.drawable.ic_profile,"Name","Position"),
            InterviewListItem(R.drawable.ic_profile,"Name","Position")))



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        interviewViewModel =
            ViewModelProviders.of(this).get(InterviewViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_interview_list, container, false)
        val context = this
//        root.setOnClickListener{
//            val selectedUser = root[position]
//            val intent = QuestionActivity.newIntent(context, )
//        }
        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        interviewList.layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.VERTICAL,false)
        interviewList.adapter = adapter
        interviewList.hasFixedSize()
        adapter.notifyDataSetChanged()


    }


}