
## Part I
---
###  `write a kotlin program with student class that has three proprty "name" and "age" and "GPA"` 
### ` and give the student  abilty to (speake hint:use print ) and the abilty to add two numbers `

private class Student(name: String, age: Int, GPA: Double){
    init {
        val stuName = "Student name is: $name"
        val stuAge = "Student age is: $age"
        val stuPoints = "Student's GPA is: $GPA"
        println(stuName)
        println(stuAge)
        println(stuPoints)
    }
    init {
        fun studentSpeak(str:String): String {
            return " Can we have a longer than break time? "
        }
        println(studentSpeak(str = " Can we have a longer than break time? "))
    }
    init {
        fun studentSum(x:Int,y:Int){
            val x = 5
            val y = 7
            println(x + y)
        }
        studentSum(5,7)
    }
}
fun main(){
    Student("Hossam", 28, 3.2)
}



## Part II - open-ended question ( optional ) .
---
### read the code below and answer the questions
### 
> ### class Weapon(val name: String)
>  ##### class Player {
> ##### var weapon: Weapon? = Weapon("Ebony Kris")
> ##### fun printWeaponName() {
> ##### if (weapon != null) {
> ##### println(weapon.name)
> ##### }
> ##### } }
> ##### fun main() {
> ##### Player().printWeaponName()
> ##### }

### Q1 = what dose Race Conditions mean
A race condition is another type of concurrency bug that occurs
when two or more threads access shared data and try to change it
at the same time. Basically,its two threads fighting each other
to change data which causes a bug in the code.

### Q2 = is there any Race Conditions in the code
Yes, at line 53, smart cast is impossible because 'weapon' is
a mutable property that could have been changed by this time.

### Q3 = what's the best way to solve the compiling error in the code using scopeFunction
Add a non-null asserted call (!!) after weapon in line 53

