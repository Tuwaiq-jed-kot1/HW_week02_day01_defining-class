# Kotlin Programming 
---
## Learning Objectives ✨
- defining class
## Getting started 
Open the [assignment.md](assignment.md) file to get started.
fun main() {
    var student = Student("Roula", 24 , 4.58)
    var student2 = Student( "Yasmen",23 , 3.58  )
    var num1: Int?
    var num2: Int?
    println("Enter the first number")
    num1 = readLine()?.toInt()
    println("Enter the seconde number")
    num2 = readLine()?.toInt()
    val pluse = student.Add(num1!!,num2!!)
    println("The sum of number is:" + pluse)

}
class Student (val name: String , val age : Int, val GPA : Double){

    init {
        println ("student name : $name")
        println ("age : $age + your GPA: $GPA")

    }
    fun Add ( num1:Int , num2 :Int):Int {

        val add = num1.plus(num2)
        return add


    }
}

