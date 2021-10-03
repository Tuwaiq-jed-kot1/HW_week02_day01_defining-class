class STUDENT(X: String, Y: Int, Z: Double) {
    var name: String = X
    var age: Int = Y
    var GPA: Double = Z

    fun Information() {

        println("Hello: $name the information sorted ," +
                " Do you want to print it press 1 No press 2 ^.^")
        var press = readLine()?.trim()
        if (press == "1") {

            println("Name: $name \n Age: $age \n GPA: $GPA")


        } else {
            println("thanks")
        }

    }


}

fun main() {

    println("Hello student , please input your name:")
    var name = readLine()?.trim()
    println("Hello student , please input your age:")
    var age = readLine()?.toInt()
    println("Hello student , please input your GPA:")
    var GPA = readLine()?.toDouble()


    val student = STUDENT(name!!, age!!, GPA!!)
    println(student.Information())


}
//Q1 = what dose Race Conditions mean
//_____________________________________
//A race condition occurs when two or more threads can access
//shared data and they try to change it at the same time.
//Because the thread scheduling algorithm can swap between
//threads at any time, you don't know the order in which the
//threads will attempt to access the shared data.
//__________________________________
//### Q2 = is there any Race Conditions in the code
//### printWeaponName()
//###
//______________________________---
//### Q3 = what's the best way to solve the compiling error in the code using scopeFunction
class Weapon(val name: String){
    var name1=name
    fun get(){
        name1=name

    }
}
class Player {
    var weapon: Weapon? = Weapon("Ebony Kris")
    fun printWeaponName() {
        if (weapon != null) {
            println(weapon!!.name)
        }
    } }
fun main() {
    Player().printWeaponName()
}