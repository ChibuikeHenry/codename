package com.example.codename

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var diceImage: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val deveoppsButton: Button = findViewById(R.id.deveopps)
        deveoppsButton.setOnClickListener {
            Toast.makeText( this,"yolo",Toast.LENGTH_SHORT).show()
            val demnoseemeButton: Button = findViewById(R.id.demnoseeme)
            demnoseemeButton.setOnClickListener {
                Toast.makeText( this,"available",Toast.LENGTH_SHORT).show()
                val learnButton: Button= findViewById(R.id.learn)
                learnButton.setOnClickListener {
                    Toast.makeText( this,"sound",Toast.LENGTH_SHORT).show()
                    val jacksonButton: Button = findViewById(R.id.jackson)
                    jacksonButton.setOnClickListener {
                        rollDice()
                    }
                    diceImage = findViewById(R.id.diceimage)
                }
            }
        }

    }

    private fun rollDice() {
        val randomInt = Random.nextInt(6)+1
        val drawableResource = when (randomInt) {
            1-> R.drawable.dice_1
            2-> R.drawable.dice_2
            3-> R.drawable.dice_3
            4->R.drawable.dice_4
            5-> R.drawable.dice_5
            else-> R.drawable.dice_6
        }

        val diceImage: ImageView = findViewById(R.id.diceimage)
        diceImage.setImageResource(drawableResource)

    }
}
