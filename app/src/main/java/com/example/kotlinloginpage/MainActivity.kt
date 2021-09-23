package com.example.kotlinloginpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextMail = findViewById<EditText>(R.id.editTextMail)
        val editTextPassword = findViewById<EditText>(R.id.editTextPassword)
        val buttonClick= findViewById<Button>(R.id.loginButton)

        val userInfo=User( editTextMail.text,editTextPassword.text)

        buttonClick.setOnClickListener{
            Toast.makeText(this,"Email: ${userInfo.name}  Password: ${userInfo.password}",Toast.LENGTH_LONG).show()
        }

    }


}