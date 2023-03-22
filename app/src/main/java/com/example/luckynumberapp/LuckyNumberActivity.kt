package com.example.luckynumberapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.random.Random

class LuckyNumberActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lucky_number)

        //Declare view
        var btn : Button = findViewById(R.id.btn)
        var luckyNumber : TextView = findViewById(R.id.luckyNum)

        //Receive data from activity 1
        var username = receiveUsername()

        //Get random number
        var randomNum = generateRandomNum()

        //Set lucky number
        luckyNumber.setText(randomNum.toString())
    }

    //Receive data
    fun receiveUsername() : String{
        var bundle: Bundle? = intent.extras
        var username = bundle?.get("name")

        return  username.toString()
    }

    //Generate random lucky number
    fun generateRandomNum() : Int{
        var randomNum = Random.nextInt(1000)
        return randomNum
    }
}