Part I - defining a class ( writing code "required").
---
`write a kotlin program with student class that has three proprty "name" and "age" and "GPA"`
 ` and give the student  abilty to (speake hint:use print ) and the abilty to add two numbers `



class Student{
    fun info1( name:String,  age:Int ,  gpa:Double) {

        var name=String
        var age=Int
        var gpa=Double
        println("the student information . ($name , $age , $gpa)")



        fun addNum(n1:Int,n2:Int){
            val sum = n1+n2
            println(" $n1 and $n2 is: $sum ")
        }
        fun Speak(){
            println(" My name is $name , My age is $age ,  my gpa is $gpa")
        }
    }}












Part II - ( optional ) .
---
 read the code below and answer the questions

> class Weapon(val name: String)
>  class Player {
    >  var weapon: Weapon? = Weapon("Ebony Kris")
    >  fun printWeaponName() {
        >  if (weapon != null) {
            > println(weapon.name)
            >  }
        >  } }
>  fun main() {
    >  Player().printWeaponName()
    >  }

### Q1 = what dose Race Conditions mean

when two threads access a shared data in the same time and both perform their changes on the data. we get
race conditions ..





