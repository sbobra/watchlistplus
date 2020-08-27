package com.example.letterboxdwatchlistplus.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.letterboxdwatchlistplus.models.WatchlistRepository

class WatchlistViewModel : ViewModel() {
    private val repository: WatchlistRepository by lazy {
        WatchlistRepository()
    }

    fun getNameList(): MutableLiveData<ArrayList<String>> {
        return repository.get()
    }
}