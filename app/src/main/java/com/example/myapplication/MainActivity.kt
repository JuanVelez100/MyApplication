package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.Toast;

import android.view.Menu
import android.view.MenuItem


class MainActivity : AppCompatActivity() {

    private var editUserName : EditText? =null;
    private var editPassword : EditText? =null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        editUserName = findViewById(R.id.editUserName);
        editPassword = findViewById(R.id.editPassword);
    }

    fun onLogin(btnLogin : View){

        var username = editUserName!!.text.toString();
        var password = editPassword!!.text.toString();

        if(username == "juan@gmail.com" &&  password == "1234"){

             AlertDialog.Builder(this)
                .setTitle(resources.getString(R.string.test_welcome)).setMessage(resources.getString(R.string.test_user))
                .setPositiveButton("Ok",positiveButton).setNegativeButton("Cancel",negativeButton).create().show();

            Toast.makeText(applicationContext,resources.getString(R.string.test_welcome),Toast.LENGTH_LONG).show();

        }else{
            Toast.makeText(this,resources.getString(R.string.test_errorlogin),Toast.LENGTH_SHORT).show();
        }

    }

    val positiveButton={_:DialogInterface,_:Int->
        val intent = Intent(this,HomeActivity::class.java);
        startActivity(intent)
    }

    val negativeButton={_:DialogInterface,_:Int->}


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main_activity, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {

            R.id.acercaDe -> {
                Toast.makeText(this,"Acerca de",Toast.LENGTH_SHORT).show();
                true
            }

            R.id.menu_buscar -> {
                Toast.makeText(this,"Buscar",Toast.LENGTH_SHORT).show();
                true
            }

            R.id.action_settings ->{
                Toast.makeText(this,"Configuración",Toast.LENGTH_SHORT).show();
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }




}