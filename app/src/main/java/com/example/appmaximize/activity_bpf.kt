package com.example.appmaximize

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_analise_agua_fisico.*

class activity_bpf : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bpf)

        setSupportActionBar(signup_toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val button_contato = findViewById<Button>(R.id.button_contato_bio)

        button_contato.setOnClickListener {
            val intent = Intent(this, ActivityContato::class.java)

            startActivity(intent)
        }
    }
}