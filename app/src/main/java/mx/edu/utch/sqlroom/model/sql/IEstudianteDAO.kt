package mx.edu.utch.sqlroom.model.sql

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import java.sql.SQLClientInfoException

@Dao
interface IEstudianteDAO {
    @Query("Select * from estudiante")
    fun GetAll():List<Estudiante>
    @Query("Select * from estudiante where Mtr like:mtr limit 1")
    @Throws(SQLClientInfoException::class)
    fun GetStudent(mtr:Int):Estudiante?
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun AddStudent(student:Estudiante)
    @Delete()
    fun DelStudent(student: Estudiante)
    @Query("Delete from estudiante")
    fun DeleteAll()
    @Update
    fun UpdateStudent(student: Estudiante)
}