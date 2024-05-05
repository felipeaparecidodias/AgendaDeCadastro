package com.example.agenda

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.agenda.dao.UsuarioDao
import com.example.agenda.model.Usuario

@Database(entities = [Usuario::class], version = 1)

abstract class AppDatabase : RoomDatabase() {

    abstract fun UsuarioDao(): UsuarioDao

    companion object{

        //definindo o bando
        private const val  DATABASE_NAME: String = "DB_USUARIO"

        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getInstace(context: Context): AppDatabase{
            return INSTANCE ?: synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    DATABASE_NAME
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}
