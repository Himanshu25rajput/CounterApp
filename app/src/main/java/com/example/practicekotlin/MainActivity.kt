package com.example.practicekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button1=findViewById<Button>(R.id.button)
        val button2=findViewById<Button>(R.id.button2)
        val textView1=findViewById<TextView>(R.id.textView)
        var count=0
        button1.setOnClickListener {
            count=count+1
                textView1.text = count.toString()
                Toast.makeText(applicationContext, " 1 aya yepeeeeeee", Toast.LENGTH_SHORT).show()
        }
        button2.setOnClickListener {
            count = count - 1
            textView1.text = count.toString()
            Toast.makeText(applicationContext, " 1 Gya hurrrrr", Toast.LENGTH_SHORT).show()
        }
    }
}

