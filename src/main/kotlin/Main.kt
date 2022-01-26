import model.Student
import model.University
import model.enums.Degree
import services.IssuerService
import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    println("Please provide all the needed information")
    println()
    print("Student name: ")
    val studentName = scan.nextLine().trim()
    print("Student age: ")
    val studentAge = scan.nextLine().trim().toInt()
    print("Student degree: ")
    val studentDegree = scan.nextLine().trim()
    print("Student credits number: ")
    val studentCreditsNumber = scan.nextLine().trim().toInt()
    print("Student faculty: ")
    val studentFaculty = scan.nextLine().trim()

    println("Please also provide the University info")
    print("University name: ")
    val universityName = scan.nextLine().trim()
    print("University established time: ")
    val universityYearCreated = scan.nextLine().trim().toInt()

    val university = University(universityName, universityYearCreated)
    val student = Student(
        studentName,
        studentAge,
        university,
        Degree.valueOf(studentDegree.uppercase()),
        studentCreditsNumber,
        studentFaculty)

    val issuerService = IssuerService(university, student)
    issuerService.issueDiploma()

}