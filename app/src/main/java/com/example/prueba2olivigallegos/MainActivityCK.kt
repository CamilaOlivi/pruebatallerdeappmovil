package com.example.prueba2olivigallegos // creado por camila olivi y karin gallegos

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.view.ViewGroup

// MainActivityCK creada por camila olivi y karin gallegos
class MainActivityCK : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Creando el layout principal programáticamente - creado por camila olivi y karin gallegos
        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            layoutParams = LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
            )
            setPadding(16, 16, 16, 16)
        }

        // Creando un TextView programáticamente - creado por camila olivi y karin gallegos
        val textView = TextView(this).apply {
            text = getString(R.string.welcome_message) // creado por camila olivi y karin gallegos
            textSize = 18f
        }

        // Creando un botón programáticamente - creado por camila olivi y karin gallegos
        val btnNavigate = Button(this).apply {
            text = getString(R.string.navigate_button) // creado por camila olivi y karin gallegos
        }

        // Creando un botón para cambiar el fragmento - creado por camila olivi y karin gallegos
        val buttonChangeFragment = Button(this).apply {
            text = getString(R.string.change_fragment_button) // creado por camila olivi y karin gallegos
        }

        // Configurando la acción del botón para navegar a la segunda actividad - creado por camila olivi y karin gallegos
        btnNavigate.setOnClickListener {
            val intent = Intent(this@MainActivityCK, SecondActivityCK::class.java)
            startActivity(intent)
        }

        // Configurando la acción para cambiar el fragmento - creado por camila olivi y karin gallegos
        buttonChangeFragment.setOnClickListener {
            val transaction = supportFragmentManager.beginTransaction()
            val secondFragment = SecondFragment()
            transaction.replace(R.id.fragmentContainer, secondFragment)
            transaction.addToBackStack(null) // Permite navegar hacia atrás
            transaction.commit()
        }

        // Añadiendo los elementos al layout - creado por camila olivi y karin gallegos
        layout.addView(textView)
        layout.addView(btnNavigate)
        layout.addView(buttonChangeFragment)

        // Estableciendo el layout como la vista principal - creado por camila olivi y karin gallegos
        setContentView(layout)
    }
}
