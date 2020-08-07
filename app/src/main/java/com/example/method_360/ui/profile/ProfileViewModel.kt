package com.example.method_360.ui.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders
import com.example.method_360.R
import com.example.method_360.ui.interview.InterviewViewModel

class ProfileViewModel : ViewModel() {
    private val _photo = MutableLiveData<View>().apply {

    }
    private val _name = MutableLiveData<String>().apply {
        value = "Karazhanov Islamidin"
    }
    private val _email = MutableLiveData<String>().apply {
        value = "karazhanovislamidin@gmail.com"
    }
    private val _position = MutableLiveData<String>().apply {
        value = "Position"
    }
    private val _userPosition = MutableLiveData<String>().apply {
        value = "Android-developer"
    }
    private val _department = MutableLiveData<String>().apply {
        value = "Department"
    }
    private val _userDerartment = MutableLiveData<String>().apply {
        value = "team 1"
    }
    val name: LiveData<String> = _name
    val email: LiveData<String> = _email
    val position: LiveData<String> = _position
    val userPosition: LiveData<String> = _userPosition
    val department: LiveData<String> = _department
    val userDepartment: LiveData<String> = _userDerartment


}