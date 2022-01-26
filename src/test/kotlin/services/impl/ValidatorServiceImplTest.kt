package services.impl

import model.Student
import model.University
import model.enums.Degree
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ValidatorServiceImplTest {

    private val service: ValidatorServiceImpl = ValidatorServiceImpl()

    @Test
    fun validateShouldReturnTrue() {
        val student = Student(
            name = "someName",
            age = 32,
            university = University(
                name = "Some",
                yearCreated = 1350),
            degree = Degree.MASTER,
            creditsNum = 140,
            faculty = "Computer Science")
        val expected = true
        assertEquals(expected, service.validate(student))
    }

    @Test
    fun validateShouldReturnFalse() {
        val student = Student(
            name = "someName",
            age = 32,
            university = University(
                name = "Some",
                yearCreated = 1350),
            degree = Degree.MASTER,
            creditsNum = 100,
            faculty = "Computer Science")
        val expected = false
        assertEquals(expected, service.validate(student))
    }
}