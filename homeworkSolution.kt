fun main(){
    println(Student().speak())
}

class Student(val name:String ="name", val age:Int=16, val gba:Int= 100) {

    fun speak() {
        println("Enter your name:")
        val name = readLine()!!
        println("Enter your age: ")
        val age = readLine()!!.trim()
        println("Enter your GBA: ")
        val gba = readLine()!!
    }

}