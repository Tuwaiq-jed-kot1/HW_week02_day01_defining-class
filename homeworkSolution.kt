

fun main (){
    // create the object and assign values then print it
    println("Please enter your Name ,Id and GPA (press ENTER between the variables) :")
    val name:String= readLine()?.toString()?:" null"
    val age :Int= readLine()?.toInt() ?: 0
    val gpa :Double=readLine()?.toDouble()?:0.0

    val student1=Student(name,age,gpa)
    println("The student information : ${student1.stuName} , ${student1.age} ,${student1.gpa} \n")
    println("Enter two numbers to summation : ")
    val num1:Int= readLine()?.toInt() ?: 0
    val num2:Int= readLine()?.toInt() ?: 0
    println("The result is : ${student1.addTwoNumbers(num1,num2)} \n")
    println("message from student : ${student1.stuSpeak()} \n \n")


    /// part 2
    Player().printWeaponName()
}
class Student(sName:String ,sAge:Int ,sGpa:Double){
    //variables
    var stuName:String=sName
    var age: Int=sAge
    var gpa :Double = sGpa

    //functions
    fun addTwoNumbers(x :Int ,y:Int):Int =x+y
    fun stuSpeak()="I want to say that i can speak and my name is $stuName"
}

class Weapon(val name: String)
class Player {
    var weapon: Weapon? = Weapon("Ebony Kris")
    fun printWeaponName() {
        weapon?.also {
            println("Part 2: The player's weapon name :  ${it.name}")
        }
    } }
