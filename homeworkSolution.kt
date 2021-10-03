class Student(name: String, age:Int, GPA:Double){
    val name_ = "Hello I'm $name, "
    val age_ = " and I'm $age years old"
    val GPA_ = " my GPA is: $GPA"

    fun Add(num1: Int, num2: Int):Int{
        val z = num1 + num2
        return z
    }

    fun Speak():String{
        return "I'm $name_ , your assistant thanks for invoking me ! "
    }


}

fun main() {
    print("Enter your name: ")
    val name = readLine()?.trim()
    print("Enter your age: ")
    val age = readLine()?.toInt()
    print("Enter your GPA: ")
    val gpa = readLine()?.toDouble()
    val s1 = Student(name!!, age!!, gpa!!)
    println(s1.name_ + s1.age_ + s1.GPA_)
    println("Now please enter two numbers: ")
    val n1 = readLine()?.toInt()
    val n2 = readLine()?.toInt()
    val sum = Add(n1!!, n2!!)
    println("The sum equals: " + sum.z)
    println(s1.Speak())
}