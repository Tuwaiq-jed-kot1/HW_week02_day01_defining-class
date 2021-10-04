# Kotlin Programming 
---
## Learning Objectives ✨
- defining class
## Getting started 
Open the [assignment.md](assignment.md) file to get started.

class Student(name: String?, age:Int?, GPA:Double?){
    var studentName = name!!
    var studentAge = age!!
    var studentGPA = GPA!!

    fun Speak () : String  {
        return "Hi, my name is $studentName, my age is $studentAge and my GBA is $studentGPA"

    }
    fun mathSum (x:Int?,y:Int?): Int {
        return x!!+y!!
    }

}
fun main(){
    println("please write your name , age and GPA")
    var student = Student(readLine()?.trim(), readLine()?.toInt(), readLine()?.toDouble())
    println(student.Speak())
    println("I want to sum two numbers")
    println(student.mathSum(readLine()?.toInt(), readLine()?.toInt()))

}