package com.example.appmaximize

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener{
            val intent = Intent(this, activity_sobre_empresa::class.java)

            startActivity(intent)}


        button_service.setOnClickListener{
            val intent = Intent(this, ActivityService::class.java)

            startActivity(intent)
        }

    }
}