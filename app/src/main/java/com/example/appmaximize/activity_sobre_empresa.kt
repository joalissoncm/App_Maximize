package com.example.appmaximize

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_analise_agua_fisico.*

class activity_sobre_empresa : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sobre_empresa)

        setSupportActionBar(signup_toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}
