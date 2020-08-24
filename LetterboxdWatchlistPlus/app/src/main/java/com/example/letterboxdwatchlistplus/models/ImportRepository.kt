package com.example.letterboxdwatchlistplus.models

import androidx.lifecycle.MutableLiveData

class ImportRepository {
    private var buttonClicked : MutableLiveData<Int> = MutableLiveData(0)

    fun buttonClicked() {
        buttonClicked.value = buttonClicked.value?.plus(1)
    }

    fun getButtonClicked() : MutableLiveData<Int> {
        return buttonClicked
    }
}
