

/*
## Part I - defining a class ( writing code "required").
write a kotlin program with student class that has three proprty "name" and "age" and "GPA"
and give the student abilty to (speake hint:use print ) and the abilty to add two numbers
*/



class Student(){
    val name = "faisal"
    val age = 24
    val gpa = 5.0

    fun speak (){
        println("I'm $name , my age is : $age , my gpa is : $gpa")

    }
    fun Add(x:Int,y:Int) {                       //// constructor
        val z = x+y
        println(" sum of numbers  : $z ")

    }


}
fun main (){
    val Student_ = Student()
    Student_.speak()
    Student_.Add(5,5)
}


/////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////


/*
## Part II - open-ended question ( optional ) .
read the code below and answer the questions
*/

Q1 = what dose Race Conditions mean:

("A race condition is another type of concurrency bug that occurs when two or more threads access shared
+ "data and try to change it at the same time.This means a situation where the output of a piece of logic
+ "requires that interleaved code is run in a particular order -- an order that cannot be guaranteed ")

Q2 = is there any Race Conditions in the code:
"Yes ,in if Condition and the println"

Q3 = whats the best way to solve the compiling error in the code using scopeFunction

fun main (){
    Player().printWeaponName()
}
class Weapon(val name: String)
class Player {
    var weapon: Weapon? = Weapon("Ebony Kris")
    fun printWeaponName() {
        if (weapon != null) {
            println(weapon?.let { it.name })
        }
    }
}

