package com.example.letterboxdwatchlistplus.models

import android.util.Log
import androidx.databinding.ObservableInt
import androidx.lifecycle.MutableLiveData

class ImportRepository {
    // MutableLIveData + no databinding
    private var buttonClicked : MutableLiveData<Int> = MutableLiveData(0)
    // Observable + databinding
    private var buttonClicked2 : ObservableInt = ObservableInt(10)
    // THIS IS THE BEST PATH - mutableLiveData + DataBinding
    private var buttonCLicked3 : MutableLiveData<Int> = MutableLiveData(0)


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

    fun button3Clicked() {
        buttonCLicked3.value = buttonCLicked3.value?.plus(1)
        Log.i("Test", "Updated: ${buttonCLicked3.value}")
    }

    fun getButton3Clicked() : MutableLiveData<Int> {
        Log.i("Test", "Get: ${buttonCLicked3.value}")
        return buttonCLicked3
    }
}
