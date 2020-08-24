package com.example.letterboxdwatchlistplus.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.letterboxdwatchlistplus.models.ImportRepository

class ImportViewModel : ViewModel() {

    private val repository: ImportRepository by lazy {
        ImportRepository()
    }


    fun buttonClicked() {
        repository.buttonClicked()
    }

    fun getButtonClicked() : MutableLiveData<Int> {
        return repository.getButtonClicked()
    }

}