package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private var editUserName : EditText? =null;
    private var editPassword : EditText? =null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editUserName = findViewById(R.id.editUserName);
        editPassword = findViewById(R.id.editPassword);
    }

    fun onLogin(botonLogin : View){

        if(editUserName!!.text.toString() == "juan@gmail.com"){
            if(editPassword!!.text.toString() == "1234"){
                val intent = Intent(this,HomeActivity::class.java);
                startActivity(intent);
            }
        }

    }






}