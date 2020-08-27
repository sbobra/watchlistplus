package com.example.letterboxdwatchlistplus.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.RecyclerView
import com.example.letterboxdwatchlistplus.R
import com.example.letterboxdwatchlistplus.utils.inflate

class WatchlistAdapter(private val names: MutableLiveData<ArrayList<String>>) : RecyclerView.Adapter<WatchlistAdapter.WatchlistHolder>() {
    //https://www.raywenderlich.com/1560485-android-recyclerview-tutorial-with-kotlin

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WatchlistHolder {
        // WITHOUT EXTENSION FUNCTION:
//        return WatchlistHolder(LayoutInflater.from(parent.context).inflate(R.layout.watchlist_recyclerview_item, parent, false)
        val inflatedView = parent.inflate(R.layout.watchlist_recyclerview_item, false)
        return WatchlistHolder(inflatedView)
    }

    override fun onBindViewHolder(holder: WatchlistHolder, position: Int) {
        val currentName : String = names.value?.get(position) ?: ""

    }

    override fun getItemCount(): Int {
        return names.value?.size ?: 0
    }

    class WatchlistHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        init {

        }
    }

}