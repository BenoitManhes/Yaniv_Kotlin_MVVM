package com.example.yanivscorekeeper.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.yanivscorekeeper.R
import com.example.yanivscorekeeper.databinding.FragmentHomeBinding
import com.example.yanivscorekeeper.utils.extensions.safeNavigate

class HomeFragment : Fragment() {

    private val binding: FragmentHomeBinding by lazy {
        FragmentHomeBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupClickListeners()
    }

    private fun setupClickListeners() {
        binding.homeMenuCardNew.setOnClickListener {
            this.findNavController().safeNavigate(
                R.id.homeFragment,
                HomeFragmentDirections.actionHomeFragmentToPlayerSelectionFragment(),
            )
        }
        binding.homeMenuCardResume.setOnClickListener {
        }
        binding.homeMenuCardRules.setOnClickListener {

        }
    }
}