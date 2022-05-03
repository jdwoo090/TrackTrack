package com.example.tracktrack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class setUpTeamsA : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_set_up_teams2)

        val nameTeams1 = findViewById<EditText>(R.id.nameTeams1)
        val nameTeams2 = findViewById<EditText>(R.id.nameTeams2)
        val nameTeams3 = findViewById<EditText>(R.id.nameTeams3)
        val nameTeams4 = findViewById<EditText>(R.id.nameTeams4)
        val nameTeams5 = findViewById<EditText>(R.id.nameTeams5)
        val nameTeams6 = findViewById<EditText>(R.id.nameTeams6)
        val nameTeams7 = findViewById<EditText>(R.id.nameTeams7)
        val nameTeams8 = findViewById<EditText>(R.id.nameTeams8)
        val nameTeams9 = findViewById<EditText>(R.id.nameTeams9)
        val nameTeams10 = findViewById<EditText>(R.id.nameTeams10)
        val nameTeams11 = findViewById<EditText>(R.id.nameTeams11)
        val nameTeams12 = findViewById<EditText>(R.id.nameTeams12)

        val setNames = findViewById<Button>(R.id.setnames)
        val setPlayers = findViewById<Button>(R.id.setplayers)
        val moreTe = findViewById<Button>(R.id.morete)

        moreTe.setOnClickListener() {
            if(moreTe.text=="More Teams") {
                nameTeams11.visibility = View.VISIBLE
                nameTeams12.visibility = View.VISIBLE

                moreTe.text="Less Teams"
            }
            else {
                nameTeams11.visibility = View.INVISIBLE
                nameTeams12.visibility = View.INVISIBLE

                moreTe.text="More Teams"
            }
        }
    }
}