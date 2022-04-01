package com.clase2503.app1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Clase R es una clase que mapea los recursos al layout
        setContentView(R.layout.activity_main)

    }
}