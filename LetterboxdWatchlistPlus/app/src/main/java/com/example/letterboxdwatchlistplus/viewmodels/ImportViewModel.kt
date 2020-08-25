package com.example.letterboxdwatchlistplus.viewmodels

import androidx.databinding.ObservableInt
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

    fun button2Clicked() {
        repository.button2Clicked()
    }

    fun getButton2Clicked() : ObservableInt {
        return repository.getButton2Clicked()
    }

}