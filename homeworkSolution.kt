fun main() {
    //## Part I - defining a class ( writing code "required").
    //write a kotlin program with student class that has three proprty "name" and "age" and "GPA"
    //and give the student abilty to (speake hint:use print ) and the abilty to add two numbers
    class Student(_name: String = "shahad") {
        var name = _name
            set(value) {
                field = value
            }

        var age = 23
            set(value) {
                field = value
            }
        var GPA = 4.6
            set(value) {
                field = value
            }

        fun speak(): String {
            return "Hi my name is $name"
        }

        fun sum(num1: Int, num2: Int): Int {
            return num1.plus(num2)
        }
        override fun toString(): String {
            return "Hi my name is $name, i'm $age years old, my GPA is $GPA"
        }

    }

    val student = Student()
    println(student.speak())
    println("sum= "+student.sum(14,5))
    val tala = Student("tala")
    tala.age+=13
    println(tala.toString())

}