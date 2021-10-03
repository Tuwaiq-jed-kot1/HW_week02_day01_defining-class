fun main() {


    // ## Kotlin I Assignment I defining class.


    print("\n## Part I - defining a class ( writing code \"required\").\n\n\n")

    println("-----------------------------------------------------------------------------------------------------------")

    println("Plesae enter name student ")
    var name: String? = readLine()!!

    println("Plesae enter age student ")
    var age: Int = readLine()!!.toInt()

    println("Plesae enter GPA student ")
    var _GPA: Double = readLine()!!.toDouble()


    studenrs(name!!, age, _GPA)


    println("-----------------------------------------------------------------------------------------------------------")
    println(" \n \n \n")


    println("-----------------------------------------------------------------------------------------------------------")

    part2()


    println("-----------------------------------------------------------------------------------------------------------")



}
}



//Part I - defining a class ( writing code "required").



class Student(var name_student: String, var age: Int?, var GPA: Double?) {

    var _name: String = name_student

    var ag2 = 5
        get() = field.plus(5)

    var speake = false

    fun sum(x: Double, y: Double): Double {

        return x + y
    }


}

fun studenrs(_name: String, _age: Int, _gpa: Double) {

    var student2 = Student(_name!!, _age, _gpa)

    println("Name : ${student2.name_student}")
    println("Age : ${student2.age}")
    println("GPA :${"%.2f".format(student2.GPA?.plus(0.5))}")

    student2.speake = true
    if (student2.speake) {
        println("Hello , my name is ${student2.name_student} i can speake and sum two number just enter two number :")

        var number1: Double = readLine()!!.toDouble() ?: 1.0
        var number2: Double = readLine()?.toDouble() ?: 1.0

        println("sum two number is :${student2.sum(number1, number2)}\n")

    }


}


//## Part II - open-ended question.

fun part2(){

    class Weapon(var name: String)
    class Player {

        var weapon: Weapon? = Weapon("Ebony Kris")

        var weapon2: Weapon = Weapon("Ebony Kris")

        //The first way
        fun printWeaponName() {

            //Solve by all scop function
            println("Please  chooes one of scope function type (alse , apply ,let , run) to solve race conditions:")
            var type: String? = readLine()!!

            when (type) {
                "also" -> weapon?.also { println("solve by $type ${it.name}") }
                "let" -> weapon?.let { println("solve by $type  ${it.name}") }

                "apply" -> weapon?.apply { println("solve by $type ${this.name}") }
                "run" -> weapon?.run { print("solve by $type ${this.name} \n") }
                else -> println(" Please enter correct name scope function ")


            }


            println("-----------------------------------------------------------------------------------------------------------")


            if (weapon != null) {
                println("The first way :${weapon!!.name}")
            }


            //The second way
            if (weapon2 != null) {

                println("The second way : ${weapon?.name}")

            }

            //The third way

            println("The third way :${weapon2.name}\n\n")





        }


    }

    Player().printWeaponName()


}