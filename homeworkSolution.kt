//          --->>>write a kotlin program with student class that has three proprty
//          "name" and "age" and "GPA" and give the student abilty to
//          (speake hint:use print ) and the abilty to add two numbers<<<---
class Student{
    val name = "Abdullah"
    val age:Int? = 20
    val GPA:Double? =  4.50

}
fun main() {

    val stu = Student()
    println("plz enter your age:- ")
    stu.age = readLine()?.toInt()
    println("plz enter your GPA:- ")
    stu.GPA = readLine()?.toDouble()
    println(" your name is: ${stu.name} \nyour age is: ${stu.age} \nand your GPA is: ${stu.GPA}")
}