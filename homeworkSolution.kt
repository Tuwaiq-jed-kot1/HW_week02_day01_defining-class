
class Students(name: String,age: Int, GPA: Double) {
    val name_s: String = "afnan"
    var age_s: Int = 25
    var GPA_s: Double = 5.0


    fun speake() {
        println("Name: $name_s \n Age: $age_s \n GPA: $GPA_s")}

    fun add_two_number(num1:Int , num2:Int ){
        var sum = num1+num2
        print("the equation  is $sum")
    }

}

fun main() {

    println("please input your name ")
    var name = readLine()!!.trim()
    println(" please input your age:")
    var age = readLine()!!.toInt()
    println(" please input your GPA:")
    var GPA = readLine()!!.toDouble()


    println("the student information are \n  student name : $name  \n  student age: $age  \n  student GPA: $GPA ")

    //////////////////2//////////
    println(" please enter first number :")
    var numf = readLine()!!.toInt()

    println(" please enter scond number :")
    var nums = readLine()!!.toInt()

    val student = Students(name, age, GPA).add_two_number(numf ,nums )
}
