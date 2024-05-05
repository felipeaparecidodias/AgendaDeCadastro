package com.example.agenda.model

import androidx.room.Entity
import androidx.room.ColumnInfo
import androidx.room.PrimaryKey

@Entity(tableName ="Tabela_usuarios")
data class Usuario (
    @ColumnInfo(name = "nome") val nome: String,
    @ColumnInfo(name = "Sobrenome") val sobrenome: String,
    @ColumnInfo(name = "Idade") val idade: String,
    @ColumnInfo(name = "Celular") val celular: String
    )
{
    @PrimaryKey(autoGenerate = true)
    var uid: Int = 0
}
