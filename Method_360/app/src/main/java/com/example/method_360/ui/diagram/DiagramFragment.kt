package com.example.method_360.ui.diagram

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.method_360.R
import com.example.method_360.ui.diagram.DiagramViewModel

class DiagramFragment : Fragment() {

    private lateinit var diagramViewModel: DiagramViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        diagramViewModel =
            ViewModelProviders.of(this).get(DiagramViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_diagram, container, false)
        val textView: TextView = root.findViewById(R.id.text_diagram)
        diagramViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}