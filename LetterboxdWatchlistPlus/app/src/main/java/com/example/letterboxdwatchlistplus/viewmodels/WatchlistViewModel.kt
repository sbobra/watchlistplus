package com.example.letterboxdwatchlistplus.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.letterboxdwatchlistplus.models.WatchlistRepository

class WatchlistViewModel(private val repository: WatchlistRepository) : ViewModel() {

    fun getText(): LiveData<String> {
        return repository.get()
    }
//
//    private fun loadText() {
//        // Do an asynchronous operation to fetch users.
//    repository.get()
//    }
}