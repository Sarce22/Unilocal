package com.eam.unilocal.activity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.eam.unilocal.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun irLogin(view: View){
        Log.v(MainActivity::class.java.simpleName, "login")
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }
    fun irMenuUsuario(view: View){
        Log.v(MainActivity::class.java.simpleName, "perfil usuario")
        val intent = Intent(this, MenuUsuarioActivity::class.java)
        startActivity(intent)
    }
}