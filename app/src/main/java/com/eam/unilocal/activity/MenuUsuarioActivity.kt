package com.eam.unilocal.activity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.eam.unilocal.R

class MenuUsuarioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_menu_usuario)

    }

    fun irPerfilUsuario(view: View){
        Log.v(MenuUsuarioActivity::class.java.simpleName, "perfil usuario")
        val intent = Intent(this, PerfilUsuarioActivity::class.java)
        startActivity(intent)
    }
}