package model

import model.enums.Degree

data class Student (val name: String,
                    val age: Int,
                    val university: University,
                    val degree: Degree,
                    val creditsNum: Int,
                    val faculty: String)