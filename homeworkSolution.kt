# Kotlin Programming 
---
//## Learning Objectives ✨
- defining class
## Getting started 
Open the [assignment.md](assignment.md) file to get started.

## Part I - defining a class ( writing code "required").
write a kotlin program with student class that has three proprty "name" and "age" and "GPA"
and give the student abilty to (speake hint:use print ) and the abilty to add two numbers

class Student {
    var name:String = "Sami"
    var age = 1
        get() = (18..65).random()
    var intGPA:Int=0
        get() = (60..100).start
    var GPA:Double=0.0

    fun speak(){
        println("My name is $name\n I am $age\nMy GPA is")
    }
    fun add(){
        //age = setOf<>()
    }
}

fun main(){
    val st1 = Student()
    st1.speak()

}