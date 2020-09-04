package com.example.letterboxdwatchlistplus.models

import androidx.lifecycle.MutableLiveData

class WatchlistRepository {

    val nameList = MutableLiveData<ArrayList<WatchlistItem>>().apply {
        value = ArrayList()
        for (i in 0..50) {
            val item = WatchlistItem(Movie("test$i"))
            value?.add(item)
        }
    }


    fun insert(user: WatchlistItem) {
        nameList.value?.add(user)
    }

    fun get(): MutableLiveData<ArrayList<WatchlistItem>> {
        return nameList
    }

    fun delete(user: String) {
        for (user in nameList.value!!) {

        }
    }
}
