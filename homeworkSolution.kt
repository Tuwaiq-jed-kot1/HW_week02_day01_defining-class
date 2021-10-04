# Kotlin Programming 
---
## Learning Objectives ✨
- defining class
## Getting started 
Open the [assignment.md](assignment.md) file to get started.
class Student(val name: String, val age: Int, val gpa: Double) {
    init {
        println("Student ($name) Created ")
    }

    fun speak() {
        println("Hello Everyone , my name is = $name , I am $age years old and My GPA is = $gpa ")
    }

    fun addTwoNumbers(num1: Int, num2: Int) {
        println("$num1 + $num2 = ${num1+num2}")
    }
}

fun main() {
    val s = Student("Hassan Khalid Ahmadi", 24, 4.95)
    s.speak()
    s.addTwoNumbers(8,18)

}