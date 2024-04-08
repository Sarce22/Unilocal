package com.eam.unilocal.activity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.eam.unilocal.R
import com.eam.unilocal.databinding.ActivityLoginBinding
import com.eam.unilocal.db.Usuarios
import java.lang.Exception

class LoginActivity : AppCompatActivity() {

    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonLogin.setOnClickListener { login() }



    }

    fun irRegistro(view: View){
        Log.v(LoginActivity::class.java.simpleName, "registro")
        val intent = Intent(this, RegistroActivity::class.java)
        startActivity(intent)
    }

    fun login(){

        val correo = binding.editTextEmail.text
        val password = binding.editTextPassword.text

        if (correo.isNotEmpty() && password.isNotEmpty()){

            try {
                val usuario = Usuarios.login(correo.toString(), password.toString())
                Toast.makeText(this, "Datos correctos", Toast.LENGTH_LONG).show()


            }catch (e:Exception){
                Toast.makeText(this, "Los datos son incorrectos", Toast.LENGTH_LONG).show()
            }



        }else{
            Toast.makeText(this, "Por favor llene los campos", Toast.LENGTH_LONG).show()
        }

    }



}