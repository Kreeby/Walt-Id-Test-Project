package services

import model.Student
import model.University
import services.impl.CreatorServiceImpl
import services.impl.ValidatorServiceImpl

class IssuerService constructor(private val university: University, private val student: Student) {
    private val creatorService = CreatorServiceImpl()
    private val validatorService = ValidatorServiceImpl()

    fun issueDiploma() {
        val isPassed = validatorService.validate(student)

        if (isPassed) {
            println("CONGRATULATIONS, ${student.name}! You got your ${student.degree} degree diploma!")
            println("We are very happy to have in our list of alumni")
            println("You can find your diploma as a text file on the same folder")
            println("//////////////////////")
            println("Creating diploma...")
            creatorService.createFile(student, university)
        } else {
            println("Sorry dear student, you haven't passed all the needed credits")
            println("Please either retake all the needed courses, otherwise you would be expelled from the University")
        }
    }
}
