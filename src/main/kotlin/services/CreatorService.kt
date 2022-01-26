package services

import model.Student
import model.University

interface CreatorService {
    fun createFile(student: Student, university: University)
}