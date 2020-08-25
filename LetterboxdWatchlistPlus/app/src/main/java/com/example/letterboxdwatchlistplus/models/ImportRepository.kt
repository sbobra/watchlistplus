package com.example.letterboxdwatchlistplus.models

import android.util.Log
import androidx.databinding.ObservableInt
import androidx.lifecycle.MutableLiveData

class ImportRepository {
    private var buttonClicked : MutableLiveData<Int> = MutableLiveData(0)
    private var buttonClicked2 : ObservableInt = ObservableInt(10)

    fun buttonClicked() {
        buttonClicked.value = buttonClicked.value?.plus(1)
    }

    fun getButtonClicked() : MutableLiveData<Int> {
        return buttonClicked
    }

    fun button2Clicked() {
        buttonClicked2.set(buttonClicked2.get() + 1)
        Log.i("Test", "Updated: ${buttonClicked2.get()}")
    }

    fun getButton2Clicked() : ObservableInt {
        Log.i("Test", "Get: ${buttonClicked2.get()}")
        return buttonClicked2
    }
}
