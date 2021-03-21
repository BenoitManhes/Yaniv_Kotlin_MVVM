package com.example.yanivscorekeeper.ui.playerselection

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import com.example.yanivscorekeeper.data.items.CardButtonPlayerItem
import com.example.yanivscorekeeper.databinding.FragmentPlayerSelectionBinding
import com.example.yanivscorekeeper.utils.Constants
import com.example.yanivscorekeeper.data.items.cardButtonPlayerItem
import com.mikepenz.fastadapter.GenericItem
import com.mikepenz.fastadapter.adapters.FastItemAdapter
import com.mikepenz.fastadapter.adapters.GenericFastItemAdapter

class PlayerSelectionFragment : Fragment() {

    private val viewModel: PlayerSelectionViewModel by viewModels()

    private val binding: FragmentPlayerSelectionBinding by lazy {
        FragmentPlayerSelectionBinding.inflate(layoutInflater)
    }

    private lateinit var fastItemAdapter: GenericFastItemAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setUpRecyclerView()
        setupObservers()
    }

    private fun setUpRecyclerView() {
        //create our FastAdapter which will manage everything
        fastItemAdapter = FastItemAdapter()

        //init our gridLayoutManager and configure RV
        val gridLayoutManager = GridLayoutManager(requireContext(), Constants.Ui.PLAYER_CARD_IN_ROW)

        binding.recyclerView.layoutManager = gridLayoutManager
        binding.recyclerView.adapter = fastItemAdapter
    }

    private fun setupObservers() {
        viewModel.players.observe(viewLifecycleOwner) { players ->
            val items = mutableListOf<GenericItem>()
            players.forEach { player ->
                items += cardButtonPlayerItem(requireContext()) {
                    pseudo = player.nickname
                    imgAvatarUrl = player.imgSrcUrl
                    cardSymbol = CardButtonPlayerItem.Symbol.find(player.cardSymbol)
                }
            }
        }
    }
}