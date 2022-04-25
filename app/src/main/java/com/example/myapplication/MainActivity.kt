package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            Toast.makeText(this,"${editTextTextPersonName.text.toString().toInt() + editTextTextPersonName2.text.toString().toInt()}",Toast.LENGTH_LONG).show()
        }
    }
}