package com.example.letterboxdwatchlistplus.models

import android.util.Log
import androidx.lifecycle.MutableLiveData

class ImportRepository {
    private var buttonClicked : MutableLiveData<Int> = MutableLiveData(0)
    private var buttonClicked2 = 10

    fun buttonClicked() {
        buttonClicked.value = buttonClicked.value?.plus(1)
    }

    fun getButtonClicked() : MutableLiveData<Int> {
        return buttonClicked
    }

    fun button2Clicked() {
        buttonClicked2++
        Log.i("Test", "Updated: $buttonClicked2")
    }

    fun getButton2Clicked() : Int {
        Log.i("Test", "Get: $buttonClicked2")
        return buttonClicked2
    }
}
