package com.torchbapps.swoosh

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedLeague =""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMenClicked(view: View){
        womenLeagueBtn.isChecked =false
        coedLeagueBtn.isChecked=false
        selectedLeague = "men"
    }



    fun onWomenClicked(view: View){
        menLeagueBtn.isChecked =false
        coedLeagueBtn.isChecked=false
        selectedLeague = "women"

    }

    fun onCoedClicked(view: View){
        menLeagueBtn.isChecked =false
        womenLeagueBtn.isChecked=false
        selectedLeague = "coed"

    }
    fun leagueNextClicked (view : View){
        if (selectedLeague !="") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE,selectedLeague)
            startActivity(skillActivity)
        }
        else {
            Toast.makeText(this,"Please select a league", Toast.LENGTH_SHORT).show()
        }
    }
}
