package com.example.andrecodo_rm87145

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputKm = findViewById<EditText>(R.id.inputDistancia)
        val inputPreco = findViewById<EditText>(R.id.inputPreco)
        val inputAutonomia = findViewById<EditText>(R.id.inputAutonomia)

        val btnCalcular = findViewById<Button>(R.id.btnCalcular)

        val txtResultado = findViewById<TextView>(R.id.txtResultado)

        btnCalcular.setOnClickListener {

            txtResultado.text = "R$ " +
                    ((inputKm.text.toString().toFloat() * inputPreco.text.toString().toFloat()) /
                    inputAutonomia.text.toString().toFloat()).toString()

        }

    }
}