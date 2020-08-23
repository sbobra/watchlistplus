package com.example.letterboxdwatchlistplus.models

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class WatchlistRepository {

    private val text: MutableLiveData<String> by lazy {
//        MutableLiveData<String>().also {
//            loadText()
//        }
        MutableLiveData<String>()
    }

    fun insert(user: Any) {}

    fun get(): LiveData<String> {
        text.value = "retrieved from repository"
        return text
    }

    fun delete(user: Any) {}
}
