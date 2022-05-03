package com.example.tracktrack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.tracktrack.ui.login.setUpTeamsActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val team1 = findViewById<Button>(R.id.team1)
        val team2 = findViewById<Button>(R.id.team2)
        val team3 = findViewById<Button>(R.id.team3)
        val team4 = findViewById<Button>(R.id.team4)
        val team5 = findViewById<Button>(R.id.team5)
        val team6 = findViewById<Button>(R.id.team6)
        val team7 = findViewById<Button>(R.id.team7)
        val team8 = findViewById<Button>(R.id.team8)
        val team9 = findViewById<Button>(R.id.team9)
        val team10 = findViewById<Button>(R.id.team10)
        val team11 = findViewById<Button>(R.id.team11)
        val team12 = findViewById<Button>(R.id.team12)

        val moreTeam = findViewById<Button>(R.id.moreTeam)
        val close = findViewById<Button>(R.id.close)
        val rename = findViewById<Button>(R.id.rename)
        val reset = findViewById<Button>(R.id.reset)

        moreTeam.setOnClickListener() {
            team11.visibility = View.VISIBLE
            team12.visibility = View.VISIBLE
            moreTeam.visibility = View.INVISIBLE
        }

        close.setOnClickListener() {
            finishAffinity()
        }

        reset.setOnClickListener() {
            team1.text = "Team 1"
            team2.text = "Team 2"
            team3.text = "Team 3"
            team4.text = "Team 4"
            team5.text = "Team 5"
            team6.text = "Team 6"
            team7.text = "Team 7"
            team8.text = "Team 8"
            team9.text = "Team 9"
            team10.text = "Team 10"
            team11.text = "Team 11"
            team12.text = "Team 12"

            reset.text = "Reset"
            rename.text = "Name Buttons"
            close.text = "Close"
            moreTeam.text = "More Teams"

            team11.visibility = View.INVISIBLE
            team12.visibility = View.INVISIBLE
            moreTeam.visibility = View.VISIBLE
        }

        rename.setOnClickListener() {
            val intent = Intent(this, setUpTeamsA::class.java)
            startActivity(intent)
        }
    }
}



