package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        setSupportActionBar(findViewById(R.id.toolbar))

        val fab: View = findViewById(R.id.fab)

        fab.setOnClickListener { view ->

            Snackbar.make(view, "Hola", Snackbar.LENGTH_LONG)
                .setAction("Action", null)
                .show()

        }

    }

    fun Prueba(view: android.view.View) {
        Snackbar.make(view, "Prueba", Snackbar.LENGTH_LONG)
            .setAction("Action", null)
            .show()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main_activity, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {

            R.id.acercaDe -> {
                Toast.makeText(this,"Acerca de", Toast.LENGTH_SHORT).show();
                true
            }

            R.id.menu_buscar -> {
                Toast.makeText(this,"Buscar", Toast.LENGTH_SHORT).show();
                true
            }

            R.id.action_settings ->{
                Toast.makeText(this,"Configuración", Toast.LENGTH_SHORT).show();
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    fun Prueba2(view: android.view.View) {

        Snackbar.make(view, "Prueba 2", Snackbar.LENGTH_LONG)
            .setAction("Action", null)
            .show()

    }


}