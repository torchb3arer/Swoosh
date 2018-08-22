package com.torchbapps.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.torchbapps.swoosh.Model.Player
import com.torchbapps.swoosh.R
import com.torchbapps.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)
        searchLeagueTxt.text = "Looking for ${player.league} ${player.skill} league near you ..."
    }
}
