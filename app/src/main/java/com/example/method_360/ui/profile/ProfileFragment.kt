package com.example.method_360.ui.profile

import android.annotation.SuppressLint
import android.graphics.BitmapFactory
import android.graphics.drawable.Drawable
import android.icu.number.NumberFormatter.with
import android.icu.number.NumberRangeFormatter.with
import android.os.Bundle
import android.view.LayoutInflater
import android.view.PointerIcon.load
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.method_360.R
import com.example.method_360.ui.profile.ProfileViewModel
import de.hdodenhof.circleimageview.CircleImageView
import java.net.URI
import java.util.logging.Level.parse

class ProfileFragment : Fragment() {

    private lateinit var profileViewModel: ProfileViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        profileViewModel =
            ViewModelProviders.of(this).get(ProfileViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_profile, container, false)
        val photo: ImageView = root.findViewById(R.id.imageView)
        photo.setImageBitmap(BitmapFactory.decodeResource(this.getResources(), R.drawable.photo));
        val name: TextView = root.findViewById(R.id.name_profile)
        profileViewModel.name.observe(viewLifecycleOwner, Observer {
            name.text = it
        })
        val email: TextView = root.findViewById(R.id.email)
        profileViewModel.email.observe(viewLifecycleOwner, Observer {
            email.text = it
        })
        val position: TextView = root.findViewById(R.id.position)
        profileViewModel.position.observe(viewLifecycleOwner, Observer {
            position.text = it
        })
        val userPosition: TextView = root.findViewById(R.id.user_position)
        profileViewModel.userPosition.observe(viewLifecycleOwner, Observer {
            userPosition.text = it
        })
        val department: TextView = root.findViewById(R.id.department)
        profileViewModel.department.observe(viewLifecycleOwner, Observer {
            department.text = it
        })
        val userDepartment: TextView = root.findViewById(R.id.user_department)
        profileViewModel.userDepartment.observe(viewLifecycleOwner, Observer {
            userDepartment.text = it
        })

        return root
    }
}