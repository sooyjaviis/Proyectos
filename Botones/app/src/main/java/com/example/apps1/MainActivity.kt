package com.example.apps1

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val mainView = findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.main)
        ViewCompat.setOnApplyWindowInsetsListener(mainView) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val botones = listOf(
            R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4,
            R.id.btn5, R.id.btn6, R.id.btn7, R.id.btn8,
            R.id.btn9, R.id.btn10, R.id.btn11, R.id.btn12
        )

        val mensajes = listOf(
            "Hola desde el botón 1",
            "Hola desde el botón 2",
            "Hola desde el botón 3",
            "Hola desde el botón 4",
            "Hola desde el botón 5",
            "Hola desde el botón 6",
            "Hola desde el botón 7",
            "Hola desde el botón 8",
            "Hola desde el botón 9",
            "Hola desde el botón 10",
            "Hola desde el botón 11",
            "Hola desde el botón 12"
        )

        botones.forEachIndexed { index, id ->
            findViewById<Button>(id).setOnClickListener {
                Toast.makeText(this, mensajes[index], Toast.LENGTH_SHORT).show()
            }
        }
    }
}
