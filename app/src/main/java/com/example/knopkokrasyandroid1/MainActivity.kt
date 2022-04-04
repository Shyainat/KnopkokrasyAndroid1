package com.example.knopkokrasyandroid1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_main)
        val button1:Button=findViewById(R.id.button_login)
        button1.setOnClickListener { openSecondActivity() }

    }

    private fun openSecondActivity() {
        val intent = Intent(this,SecondActivity::class.java)
        val login:EditText = findViewById(R.id.login)
        val password:EditText = findViewById(R.id.password)
        val text1:TextView = findViewById(R.id.incorrect_login)
        intent.putExtra(SecondActivity.EDIT_LOGIN,login.text.toString())
        when {
                (password.length() > 7 && login.length() > 2 && password.text.any { it.isDigit() })->startActivity(intent)
            (login.length() < 3 && (password.length() <8 || !password.text.any { it.isDigit() }))->text1.text =getString(
                            R.string.incorrect_login_password)
            (password.length() < 8 || !password.text.any { it.isDigit() })->text1.text =getString(R.string.incorrect_password)
                    else->text1.text =getString(R.string.incorrect_login)

        }


    }
}