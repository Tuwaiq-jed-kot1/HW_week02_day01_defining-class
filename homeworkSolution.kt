# Kotlin Programming 
---
## Learning Objectives ✨
- defining class
## Getting started 
Open the [assignment.md](assignment.md) file to get started.

class Student(val name: String, val age: Int, val GPA: Double) {

    fun speak(name: String, age: Int, GPA: Double) {
        println("My name is $name , I am $age and my GPA is $GPA ")
    }

    fun addNum(n1: Int, n2: Int) {
        println(" $n1 + $n2 = ${n1 + n2}")
    }
}
fun main(){
    val classMate: Student = Student("Ahmad", 22 , 4.9 )
    classMate.speak("Ruba", 24, 4.65)
    classMate.addNum(1,2)