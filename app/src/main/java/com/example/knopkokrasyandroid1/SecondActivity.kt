package com.example.knopkokrasyandroid1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val editlogin:String? = intent.getStringExtra(EDIT_LOGIN)
        val info:TextView = findViewById(R.id.main_activity2_text_view)
        info.text ="Ваш логин:$editlogin"

    }
    companion object{
        const val EDIT_LOGIN ="editlogin"
    }
}