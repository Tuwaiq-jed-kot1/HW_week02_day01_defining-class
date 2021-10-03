
//Part1 -----------------------------------------------------------------

//write a kotlin program with student class that has three property "name" and "age" and "GPA"
//and give the student ability to (speak hint:use print ) and the ability to add two numbers

//First, Create it a private class named Student to store all my three attributes
private class Student(name: String, age: Int, GPA: Double){
   init {
       val stuName = "Student name is: $name"
       val stuAge = "Student age is: $age"
       val stuPoints = "Student's GPA is: $GPA"
       println(stuName)
       println(stuAge)
       println(stuPoints)
   }
//By using init I organized my class so it will execute each function in order to enhance optimazation
    init {
    //This function prints out what the student say
        fun studentSpeak(str:String): String {
            return "Can we have longer break time? "
        }
        println(studentSpeak(str = "Can we have longer break time? "))
    }
    init {
    //This function adds two numbers for the student
        fun studentSum(x:Int,y:Int){
            val x = 2
            val y = 3
            println(x + y)
        }
        studentSum(2,3)

    }


}


//Finally all I did was call the class with the paramieters in the main function and it will execute the exact
// output that I want in the order that I want (Sometimes less is more!!)
fun main(){
    Student("Faisal", 25, 4.5)

 }
//Part2----------------------------------------------------------------

//class Weapon(val name: String)
//class Player {
//    var weapon: Weapon? = Weapon("Ebony Kris")
//    fun printWeaponName() {
//        if (weapon != null) {
//            println(weapon.name)
//        }
//    } }
//fun main() {
//    Player().printWeaponName()
//}

//Q1: What does Race Conditions mean?
//A1: A race condition is another type of concurrency bug that occurs when two or more threads access
//shared data and try to change it at the same time. Basically, its two threads fighting eachother to change
//data which causes a bug in the code.

//Q2: Is there any Race Conditions in the code?
//A2: Yes, at line 53, smart cast is immposible because 'weapon' is a mutable property
//that could have been changed by this time.

//Q3: What's the best way to solve the compiling error in the code using scopeFunction
//A3: Add a non-null asserted call (!!) after weapon in line 53.