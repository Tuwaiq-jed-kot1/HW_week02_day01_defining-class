//part|
class Student{
    var name="Ahmad"
    var age=18
    var gpa=3.6

    fun addTwoNumbers(num1:Int,num2:Int){
        val sumResult = num1+num2
        println("The sum of $num1 and $num2 is: $sumResult ")
    }
    fun abilityToSpeak(){
        println("Hello my name is $name , I'm $age yers old and my $gpa")
    }
}
fun main(){
    val studentNo1 = Student()
    studentNo1.addTwoNumbers(2,3)
    studentNo1.abilityToSpeak()
    studentNo1.name="Renad"
    studentNo1.age=23
    studentNo1.gpa=3.4
    studentNo1.abilityToSpeak()


//---------------------------------------------
//part||

    //Question 1
    println("Q1 = what dose Race Conditions mean?\n" +
            "Solution: When two parts of the code modify the code state at the same time\n" +
            "and in this case unexpected errors may occur, so the compiler reject this.")

    println("\n----------------\n")

    //Question 2
    println("Q2 = is there any Race Conditions in the code?\n" +
            "Solution:Yes, it is occur when the condition of if statement and the println" +
            " function try to access weapon variable ")

    println("\n----------------\n")

    //Question 3
    Player().printWeaponName()
}
class Weapon(val name: String)
class Player {
    var weapon: Weapon? = Weapon("Ebony Kris") //mutable and nullable property
    fun printWeaponName() {
        weapon?.also { println(it.name) }
    }
}
