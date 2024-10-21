package com.example.ismael_salvador_uf1_act6

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextValue = findViewById<EditText>(R.id.editTextValue)
        val buttonShowToast = findViewById<Button>(R.id.buttonShowToast)

        buttonShowToast.setOnClickListener {
            val value = editTextValue.text.toString()
            Toast.makeText(this, value, Toast.LENGTH_SHORT).show()
        }
    }
}
