package com.eam.unilocal.model

import java.time.LocalDate

class Lugar (var id:Int, var nombre:String, var descripcion:String,
             var imagenes:List<String>, var idUsuario:Int,
             var estado:Estado, var idCategoria:Int,
             var posicion: Posicion,
             var idCiudad:Int, var fecha: LocalDate) {

//Agregar lalitud y longitud y el id de la ciudad
    var telefonos: List<String> = ArrayList()
}