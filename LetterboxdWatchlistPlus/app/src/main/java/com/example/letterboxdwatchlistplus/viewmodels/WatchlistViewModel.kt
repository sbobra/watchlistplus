package com.example.letterboxdwatchlistplus.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import com.example.letterboxdwatchlistplus.models.WatchlistItem
import com.example.letterboxdwatchlistplus.models.WatchlistRepository

class WatchlistViewModel : ViewModel() {
    private val selectMode : MutableLiveData<Boolean> = MutableLiveData(false)



    private val repository: WatchlistRepository by lazy {
        WatchlistRepository(selectMode)
    }

    fun getNameList(): MutableLiveData<ArrayList<WatchlistItem>> {
        return repository.get()
    }

    fun toggleSelectMode() {
        selectMode.value = selectMode.value?.not()
    }

    fun getSelectMode() : MutableLiveData<Boolean> {
        return selectMode
    }
}