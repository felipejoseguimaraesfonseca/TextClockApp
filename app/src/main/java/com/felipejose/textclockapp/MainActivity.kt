package com.felipejose.textclockapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextClock
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val relogio = findViewById<TextClock>(R.id.relogio) as TextClock

        relogio.setOnClickListener{
            Toast.makeText(this@MainActivity,"Relógio", Toast.LENGTH_SHORT).show()
        }
    }
}
