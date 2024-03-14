package com.eam.unilocal.model

import java.time.LocalDate

class Comentario(var id:Int, var texto:String, var idUsuario: Int, var idLugar: Int, var calificacion:Int, var fecha: LocalDate) {
}