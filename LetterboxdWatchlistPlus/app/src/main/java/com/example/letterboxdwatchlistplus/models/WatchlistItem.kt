package com.example.letterboxdwatchlistplus.models

import androidx.lifecycle.MutableLiveData

class WatchlistItem(val movie: Movie, val mainSelectMode: MutableLiveData<Boolean>) {
    private val selectedState: MutableLiveData<Boolean> = MutableLiveData(false)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as WatchlistItem

        if (selectedState != other.selectedState) return false

        return true
    }

    override fun hashCode(): Int {
        return selectedState.hashCode()
    }


}