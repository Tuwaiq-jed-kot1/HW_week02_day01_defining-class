# Kotlin Programming 
---
## Learning Objectives ✨
- defining class
## Getting started 
Open the [assignment.md](assignment.md) file to get started.

//## Part I - defining a class ( writing code "required").
//write a kotlin program with student class that has three proprty "name" and "age" and "GPA"
//and give the student abilty to (speake hint:use print ) and the abilty to add two numbers

class Student(_name: String, _age: Int, _GPA: Double){

    val name = _name
    val age = _age
    val gpa = _GPA

    fun speak(){
        println("My name is $name and I am $age years old ")
    }
    fun addTwoNums(num1: Int, num2: Int){
        println("$num1 + $num2 = ${num1 + num2}")
    }
}
fun main(){
    val student: Student = Student("ahmad", 22, 3.5)
    student.speak()
    student.addTwoNums(5, 6)
}

//=========================================================================
//## Part II - open-ended question ( optional ) .
//read the code below and answer the questions
//class Weapon(val name: String)
//
class Player {
    var weapon: Weapon? = Weapon("Ebony Kris")
    fun printWeaponName() {
        if (weapon != null) {
            println(weapon.name)
        }
    } }
fun main() {
    Player().printWeaponName()
}
//Q1 = what dose Race Conditions mean
//Race condition is a type of concurrency bugs. It happens when two or more threads share the same data and
// try to change it at the same time. In this code,
//we can see that weapon variable value can be changed after the if statement condition is met

//Q2 = is there any Race Conditions in the code
//Yes
//    if (weapon != null) {
//        println(weapon.name)
//    }
//Q3 = what's the best way to solve the compiling error in the code using scopeFunction
//By using the let function
weapon?.let{
    printLn(it.name)
}
