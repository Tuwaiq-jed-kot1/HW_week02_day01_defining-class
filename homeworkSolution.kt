fun main() {
    //Constructor Parameters
    class Student(_name: String, _age: Int, _GPA: Double) {
        //assigning
        var name = _name
            //getters and setters
            get() = field?.capitalize()
            set(value) {
                field = value
            }
        var age = _age
            get() = field
            set(value) {
                field = value
            }
        var GPA = _GPA
            get() = field
            set(value) {
                field = value
            }

        //function to the class variables
        fun speak() {

            println("I'm " + name + " and my age is " + age + " with total GPA " + GPA)
        }

        //summation function
        fun sum(x: Int, y: Int) {
            var z = x + y
            println(z)
        }
    }

    var student = Student("khaled", 19, 4.4)
    //invoke speak function
    student.speak()
    //invoke sum function
    student.sum(6, 7)


    println("")

    //partII


/*    class Weapon(val name: String)
    class Player {
        var weapon: Weapon? = Weapon("Ebony Kris")
        fun printWeaponName() {
            if (weapon != null) {
                println(weapon.name)
            }
        } }
    fun main() {
        Player().printWeaponName()
    }*/

    /*q1*/println("what dose Race Conditions mean?")
    println("is basically the attempt at changing data by 2 or more threads at the same time whom have the access")

    println()

    /*q2*/ println("is there any Race Conditions in the code?")
    println("yes, it's inside the if condition with the statement \"println(weapon.name)\" ")

    println()

    /*q3*/ println("what's the best way to solve the compiling error in the code using scopeFunction?")
    println("add non-null asserted call in the previous statement")

    println()

    println("the execution after modifying")

    println()

    class Weapon(val name: String)
    class Player {
        var weapon: Weapon? = Weapon("Ebony Kris")
        fun printWeaponName() {
            if (weapon != null) {
                println(weapon!!.name)
            }
        }
    }

    Player().printWeaponName()


}





