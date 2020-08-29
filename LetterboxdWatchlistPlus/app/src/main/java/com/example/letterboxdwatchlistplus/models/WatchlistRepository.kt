package com.example.letterboxdwatchlistplus.models

import androidx.lifecycle.MutableLiveData

class WatchlistRepository {

    private val nameList = MutableLiveData<ArrayList<String>>().apply {
        value = arrayListOf("test1", "test2", "test3", "test4", "test5")
    }


    fun insert(user: String) {
        nameList.value?.add(user)
    }

    fun get(): MutableLiveData<ArrayList<String>> {
        return nameList
    }

    fun delete(user: String) {
        for (user in nameList.value!!) {

        }
    }
}
