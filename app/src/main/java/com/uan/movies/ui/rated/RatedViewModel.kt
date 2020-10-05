package com.uan.movies.ui.rated

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RatedViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Vista de mejor valorados"
    }
    val text: LiveData<String> = _text
}