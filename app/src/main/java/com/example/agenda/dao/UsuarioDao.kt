package com.example.agenda.dao

import androidx.room.Dao
import androidx.room.Insert
import com.example.agenda.model.Usuario


@Dao
interface UsuarioDao {
    @Insert
    fun inserir(listaUsuarios: MutableList<Usuario>)

}