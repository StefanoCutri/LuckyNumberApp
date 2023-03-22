package com.example.luckynumberapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Declare views
        var btn : Button = findViewById(R.id.btn)
        var edt : TextView = findViewById(R.id.edt)

        btn.setOnClickListener(){
            if (edt.text.isNotEmpty()){
                var username = edt.text

                //Explicit intents
                var i = Intent(this, LuckyNumberActivity::class.java)

                //Passing username
                i.putExtra("name", username)

                //Go to second activity
                startActivity(i)
            }
        }

    }
}

