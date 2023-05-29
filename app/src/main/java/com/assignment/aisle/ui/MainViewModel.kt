package com.assignment.aisle.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val bottomBarVisible = MutableLiveData(true)
}