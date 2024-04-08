package com.eam.unilocal.db

import com.eam.unilocal.model.Rol
import com.eam.unilocal.model.Usuario

object Usuarios {

    private val usuarios:ArrayList<Usuario> = ArrayList()

    init {
        usuarios.add(Usuario(1,"Sebastian",Rol.MODERADOR,"Sarce","arce@","123"))
        usuarios.add(Usuario(2,"Mariana",Rol.MODERADOR,"Smari","mari@","1234"))
        usuarios.add(Usuario(3,"Juan",Rol.CLIENTE,"Sjuan","juan@","12345"))
    }


fun listar():ArrayList<Usuario>{
    return usuarios
}

fun agregar(usuario: Usuario) {
    usuarios.add(usuario)
}


fun login(correo:String, password:String):Usuario{
    val respuesta = usuarios.first{u -> u.password == password && u.correo == correo }
    return respuesta
}


}