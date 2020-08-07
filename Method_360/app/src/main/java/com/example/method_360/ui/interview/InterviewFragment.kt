package com.example.method_360.ui.interview

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.method_360.R
import kotlinx.android.synthetic.main.fragment_interview_list.*

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