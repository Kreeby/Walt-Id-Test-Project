package services.impl

import model.Student
import model.University
import services.CreatorService
import java.io.File

class CreatorServiceImpl: CreatorService {

    override fun createFile(student: Student, university: University) {
        val fileName = "diploma.txt"

        val file = File(fileName)
        file.appendText("    ${university.name} - ${university.yearCreated}\n")
        file.appendText("    Upon the Recommendation of the Faculty hereby confers on \n")
        file.appendText("    ${student.name} at the age of ${student.age}")
        file.appendText("    The degree of ${student.degree} of Science in ${student.faculty}")
        file.appendText("    For completing all the needed credits. Credits in total: ${student.creditsNum}")

        println("Diploma has been created successfully!")
    }
}