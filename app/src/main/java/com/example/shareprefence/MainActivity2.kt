package com.example.shareprefence

import android.annotation.SuppressLint
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val name1=findViewById<TextView>(R.id.name1)
        val email1=findViewById<TextView>(R.id.email1)
        val localstorage=getSharedPreferences("user", Context.MODE_PRIVATE)
        val nameget=localstorage.getString("username","Not Found")
        val emailget=localstorage.getString("useremail","Not Found")
        name1.text=nameget.toString()
        email1.text=emailget.toString()

        Toast.makeText(this, "$nameget", Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "$emailget", Toast.LENGTH_SHORT).show()
        
    }
}