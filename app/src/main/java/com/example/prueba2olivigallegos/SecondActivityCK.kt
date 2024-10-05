package com.example.prueba2olivigallegos // creado por camila olivi y karin gallegos

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

// SecondActivityCK creada por camila olivi y karin gallegos
class SecondActivityCK : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Usando un layout XML existente o creándolo programáticamente
        val textView = TextView(this).apply {
            text = "Esta es la segunda pantalla" // creado por camila olivi y karin gallegos
            textSize = 20f
        }

        // Estableciendo el contenido de la actividad
        setContentView(textView)
    }
}
