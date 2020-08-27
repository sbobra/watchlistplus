package com.example.letterboxdwatchlistplus.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.example.letterboxdwatchlistplus.views.WatchlistFragmentDirections
import com.example.letterboxdwatchlistplus.databinding.FragmentWatchlistBinding
import com.example.letterboxdwatchlistplus.viewmodels.WatchlistViewModel

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class WatchlistFragment : Fragment() {
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    private var _binding: FragmentWatchlistBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       val watchListViewModel: WatchlistViewModel by activityViewModels()
        _binding = FragmentWatchlistBinding.inflate(inflater, container, false)
        binding.watchListViewModel = watchListViewModel
        binding.lifecycleOwner = viewLifecycleOwner // need to call this when using livedata and viewbinding


        binding.textTest.setOnClickListener { onClick() }

        val watchlistViewModel: WatchlistViewModel by activityViewModels()
        watchlistViewModel.getNameList().observe(viewLifecycleOwner, Observer<ArrayList<String>>{ name ->
            // update UI
        })

        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            WatchlistFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    // How to navigate manually to another fragment
    private fun onClick() {
        val action =
            WatchlistFragmentDirections.actionWatchlistFragmentToImportFragment()
        findNavController().navigate(action)
    }
}
