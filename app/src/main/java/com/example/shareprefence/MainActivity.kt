package com.example.shareprefence

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val name = findViewById<EditText>(R.id.name)
        val email = findViewById<EditText>(R.id.email)
        val save = findViewById<Button>(R.id.save)
        val show = findViewById<Button>(R.id.show)

        val localstorage = getSharedPreferences("user", Context.MODE_PRIVATE)

        save.setOnClickListener {
            val editpref = localstorage.edit()
            editpref.putString("username", "" + name.text.toString())
            editpref.putString("useremail", "" + email.text.toString()).apply()
            Toast.makeText(this, " Save ${name.text}  ${email.text}", Toast.LENGTH_SHORT).show()
        }


        show.setOnClickListener {
            //val getname=loclahost.getStringSet("username","Name Not Found")

            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }


    }
}