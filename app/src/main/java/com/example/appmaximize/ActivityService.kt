package com.example.appmaximize

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import kotlinx.android.synthetic.main.activity_main.*

class ActivityService : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_services)

        val btn_agua_micro = findViewById<ImageButton>(R.id.btn_agua_micro)

        btn_agua_micro.setOnClickListener{
            val intent = Intent(this, activity_analise_agua_micro::class.java)

            startActivity(intent)}

        val btn_agua_fisico = findViewById<ImageButton>(R.id.btn_agua_fisico)

        btn_agua_fisico.setOnClickListener{
            val intent = Intent(this, activity_analise_agua_fisico::class.java)

            startActivity(intent)}

        val btn_micro_food = findViewById<ImageButton>(R.id.btn_micro_food)

        btn_micro_food.setOnClickListener{
            val intent = Intent(this, activity_analise_food_micro::class.java)

            startActivity(intent)}

        val btn_fisico_food = findViewById<ImageButton>(R.id.btn_fisico_food)

        btn_fisico_food.setOnClickListener{
            val intent = Intent(this, activity_analise_food_fisico::class.java)

            startActivity(intent)}

        val btn_bios = findViewById<ImageButton>(R.id.btn_biosseg)

        btn_bios.setOnClickListener{
            val intent = Intent(this, activity_biosseguranca::class.java)

            startActivity(intent)}

        val btn_bpf = findViewById<ImageButton>(R.id.btn_bpf)

        btn_bpf.setOnClickListener{
            val intent = Intent(this, activity_bpf1::class.java)

            startActivity(intent)}

    }
}