package com.example.letterboxdwatchlistplus.adapters

import android.graphics.Movie
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.RecyclerView
import com.example.letterboxdwatchlistplus.databinding.WatchlistRecyclerviewItemBinding


//TODO: adapter isn't referenced anywhere
class WatchlistAdapter(private val names: ArrayList<MutableLiveData<String>>) : RecyclerView.Adapter<WatchlistAdapter.WatchlistHolder>() {
    //https://www.raywenderlich.com/1560485-android-recyclerview-tutorial-with-kotlin

    private var _binding: WatchlistRecyclerviewItemBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WatchlistHolder {
        // WITHOUT EXTENSION FUNCTION:
//        return WatchlistHolder(LayoutInflater.from(parent.context).inflate(R.layout.watchlist_recyclerview_item, parent, false)

        // WITH KOTLIN EXTENSION FUNCTION
//        val inflatedView = parent.inflate(R.layout.watchlist_recyclerview_item, false)
//        return WatchlistHolder(inflatedView)

        _binding = WatchlistRecyclerviewItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        //TODO: need this if we want to use LiveData
        binding.lifecycleOwner = parent.lifeCycleOwner
        return WatchlistHolder(binding)
    }

    override fun onBindViewHolder(holder: WatchlistHolder, position: Int) {
        //TODO: make this a List<MutableLiveData<String>>
        //TODO: but also, this doesn't have to be a MutableLiveData the setup only happens once and then it doesn't need to change if the string changes
        //TODO: can just be a normal string
        //TODO: how to use databinding to set up onclick listener
        val currentName : MutableLiveData<String> = names[position]
        holder.setUp(currentName)
    }

    override fun getItemCount(): Int {
        return names.size
    }

    class WatchlistHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private lateinit var itemViewBinding : WatchlistRecyclerviewItemBinding

        constructor(itemViewBinding: WatchlistRecyclerviewItemBinding) : this(itemViewBinding.root) {
            this.itemViewBinding = itemViewBinding
        }

        fun setUp(item: MutableLiveData<String>) {
            // TODO: This could be stored as a string
            itemViewBinding.itemName = item
//            holder.binding.executePendingBindings()
        }
    }

}