package com.example.prueba2olivigallegos // creado por camila olivi y karin gallegos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

// FirstFragment creado por camila olivi y karin gallegos
class FirstFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflar el layout del fragmento - creado por camila olivi y karin gallegos
        return inflater.inflate(R.layout.fragment_first, container, false)
    }
}

