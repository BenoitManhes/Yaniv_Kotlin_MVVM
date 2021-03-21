package com.example.yanivscorekeeper.ui.playerselection

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.yanivscorekeeper.data.entities.Player

class PlayerSelectionViewModel : ViewModel() {

    private var _players = MutableLiveData<MutableList<Player>>(mutableListOf())
    val players: LiveData<MutableList<Player>>
        get() = _players

    private var _loading = MutableLiveData(false)
    val loading: LiveData<Boolean>
        get() = _loading

    init {
        testPlayers()
    }

    private fun testPlayers() {
        _players.value = mutableListOf(
            Player(
                id = 1.toDouble(),
                nickname = "BeuBeu",
                imgSrcUrl = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.svgrepo.com%2Fsvg%2F170303%2Favatar&psig=AOvVaw22i_p24x7YjUjwh_D7ZWR0&ust=1609354784540000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCODElfjv8-0CFQAAAAAdAAAAABAc"
            ),
            Player(
                id = 1.toDouble(),
                nickname = "Bob",
                imgSrcUrl = "https://www.google.com/imgres?imgurl=https%3A%2F%2Fwww.shareicon.net%2Fdata%2F2016%2F07%2F05%2F791224_man_512x512.png&imgrefurl=https%3A%2F%2Fwww.shareicon.net%2Fprofile-people-business-avatar-man-boy-user-791224&tbnid=ph5oQTZ6mJthvM&vet=10CAMQxiAoAGoXChMI4MSV-O_z7QIVAAAAAB0AAAAAEB8..i&docid=3sBvkOKpTEkesM&w=512&h=512&itg=1&q=avatar%20icon&ved=0CAMQxiAoAGoXChMI4MSV-O_z7QIVAAAAAB0AAAAAEB8"
            ),
            Player(
                id = 1.toDouble(),
                nickname = "Rachid",
                imgSrcUrl = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.svgrepo.com%2Fsvg%2F170303%2Favatar&psig=AOvVaw22i_p24x7YjUjwh_D7ZWR0&ust=1609354784540000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCODElfjv8-0CFQAAAAAdAAAAABAc"
            ),
            Player(
                id = 1.toDouble(),
                nickname = "Mr Freeze",
                imgSrcUrl = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.svgrepo.com%2Fsvg%2F170303%2Favatar&psig=AOvVaw22i_p24x7YjUjwh_D7ZWR0&ust=1609354784540000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCODElfjv8-0CFQAAAAAdAAAAABAc"
            ),
            Player(
                id = 1.toDouble(),
                nickname = "Jacky la menace",
                imgSrcUrl = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.svgrepo.com%2Fsvg%2F170303%2Favatar&psig=AOvVaw22i_p24x7YjUjwh_D7ZWR0&ust=1609354784540000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCODElfjv8-0CFQAAAAAdAAAAABAc"
            ),
            Player(
                id = 1.toDouble(),
                nickname = "Will",
                imgSrcUrl = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.svgrepo.com%2Fsvg%2F170303%2Favatar&psig=AOvVaw22i_p24x7YjUjwh_D7ZWR0&ust=1609354784540000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCODElfjv8-0CFQAAAAAdAAAAABAc"
            ),
        )
    }
}