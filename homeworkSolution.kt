/*# Kotlin Programming
---
## Learning Objectives ✨
- defining class
## Getting started
Open the [assignment.md](assignment.md) file to get started.*/
//------------------------------------Part I - defining a class ( writing code "required")------------------------------------------
class Student(_name: String, _age: Int, _GPA: Double) {
    private var name = _name
    private var age = _age
    private var GPA = _GPA
    fun speake() {
        println("Hi,My name is $name,  I’m $age years old....My GPA is $GPA ")
    }

    fun add(num1: Double, num2: Double) = println("The result of sum : ${num1 + num2}")
}

fun main() {
    var student1 = Student("Nada", 22, 4.9).run {
        speake()
        add(1.0, 5.5)
    }
    var student2 = Student("Shatha", 21, 4.5).apply {
        speake()
        add(1.0, 5.5)
    }

    //student1.speake()
}
//------------------------------------Part II - open-ended question ( optional )------------------------------------------
//Q1 = what dose Race Conditions mean
/* Based on Kotlin Programming Guide, a race condition happens when another component of your code affects the state of your code at the same time,
resulting in unpredictable effects.*/

//Q2 = is there any Race Conditions in the code
//Yes, there is in line "println(weapon.name)"

//Q3 = what's the best way to solve the compiling error in the code using scopeFunction
/*
fun printWeaponName() {
    weapon?.apply { println(this.name) }

or

fun printWeaponName() {
    weapon?.also { println(this.name) }
}*/
