package mx.edu.utch.sqlroom.model.sql

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "estudiante")
data class Estudiante(
    @PrimaryKey(autoGenerate = true) val id:Int?,
    @ColumnInfo(name = "Nombre") val nombre:String?,
    @ColumnInfo(name = "Apellidos") val apellidos:String?,
    @ColumnInfo(name = "Mtr", index = true) val mtr:Int
)
