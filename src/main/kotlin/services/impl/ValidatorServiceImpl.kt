package services.impl

import model.Student
import services.ValidatorService

class ValidatorServiceImpl: ValidatorService {
    companion object {
        const val NEEDED_CREDITS_NUM = 140
    }

    override fun validate(student: Student): Boolean {
        if (student.creditsNum >= NEEDED_CREDITS_NUM ) {
            return true
        }
        return false
    }
}