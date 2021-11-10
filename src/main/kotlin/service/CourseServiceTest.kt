package service

import model.Course
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class CourseServiceTest {
}
    val registro = Course("10","mobile",2,null)
    var servicoCursos = CourseService()
    @Test

    fun registerCourses(){
        servicoCursos.registerCourse(registro)
        assertEquals(true, servicoCursos.registrado("10"))
    }