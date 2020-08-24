package com.example.letterboxdwatchlistplus.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.example.letterboxdwatchlistplus.databinding.FragmentImportBinding
import com.example.letterboxdwatchlistplus.viewmodels.ImportViewModel

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class ImportFragment : Fragment() {
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    private var _binding: FragmentImportBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val importViewModel: ImportViewModel by viewModels()

        _binding = FragmentImportBinding.inflate(inflater, container, false)

        binding.button.setOnClickListener {
            // TODO:
            importViewModel.buttonClicked()
        }

        importViewModel.getButtonClicked().observe(viewLifecycleOwner, Observer<Int> { buttonClickedCount ->
            binding.welcomeText.text = "hello $buttonClickedCount"
        })


        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ImportFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }


}
