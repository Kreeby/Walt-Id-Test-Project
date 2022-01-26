package services

import model.Student

interface ValidatorService {
    fun validate(student: Student) : Boolean
}