package com.example.letterboxdwatchlistplus.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.letterboxdwatchlistplus.databinding.WatchlistRecyclerviewItemBinding


class WatchlistAdapter : ListAdapter<String, WatchlistAdapter.WatchlistHolder>(WatchlistDiffCallback()) {
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
//        binding.lifecycleOwner = parent.lifeCycleOwner
        return WatchlistHolder(binding)
    }

    override fun onBindViewHolder(holder: WatchlistHolder, position: Int) {
        //TODO: make this a List<MutableLiveData<String>>
        //TODO: but also, this doesn't have to be a MutableLiveData the setup only happens once and then it doesn't need to change if the string changes
        //TODO: can just be a normal string
        //TODO: how to use databinding to set up onclick listener
        val currentName: String = getItem(position)
        holder.setUp(currentName)
    }

    // class WatchlistHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    class WatchlistHolder(private val itemViewBinding: WatchlistRecyclerviewItemBinding) : RecyclerView.ViewHolder(itemViewBinding.root) {
//        private lateinit var itemViewBinding: WatchlistRecyclerviewItemBinding
//
//        constructor(itemViewBinding: WatchlistRecyclerviewItemBinding) : this(itemViewBinding.root) {
//            this.itemViewBinding = itemViewBinding
//        }

        init {
//            itemViewBinding.setClickListener {
//                itemViewBinding.plant?.let { plant ->
//                    navigateToPlant(plant, it)
//                }
//            }
        }

        fun setUp(item: String) {
            // TODO: This could be stored as a string
            itemViewBinding.itemName = item
//            itemViewBinding.executePendingBindings()
        }
    }

    private class WatchlistDiffCallback : DiffUtil.ItemCallback<String>() {
        override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
            return oldItem == newItem
        }
    }

}