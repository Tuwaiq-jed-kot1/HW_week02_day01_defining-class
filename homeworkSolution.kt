
fun main(){

    class Student(myName:String,myAge:String,GPA:String) {
        var name = myName
        var age = myAge
        var GPA = GPA

        fun speak() {
            println("Hi my name is $name, i'm $age years old, my GPA is $GPA")
        }

        fun sum(num1: Int, num2: Int): Int {
            return num1.plus(num2)
        }
    }

    val student = Student("Bashayer","23","5.0")
    println()
    student.speak()
    println("the result of sum: "+student.sum(14,5))
    student.sum(3,5)



// PART 2
    println()
    println("Q1 = what dose Race Conditions mean")
    println("A race condition occurs when two or more threads can access shared data and they try to change it"+
            "at the same time. Because the thread scheduling algorithm can swap between threads at any tim" +
            "you don't know the order in which the threads will attempt to access the shared data.")
    println()
    println("Q2 = is there any Race Conditions in the code")
    println(" yes, it is in >> printWeaponName()")
    println()
    println("Q3 = what's the best way to solve the compiling error in the code using scopeFunction")
    println(" declare another variable -- ")

/*
class Weapon(val name: String){
    var name=name
    fun get(){
        name1=name
    }
}*/
}

