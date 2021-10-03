class Student(name:String,age:Int,GPA:Double){
    var name = name
    var age = age
    var GPA = GPA

    fun speak(){
        println("My name is $name, I'm $age old , I graduated with GPA of $GPA")
    }

    fun addTwoNumbers(x:Int , y:Int):Int{
        return x + y
    }
}

fun main(){
    var ahmed:Student = Student("Ahmed",26,3.5)
    ahmed.speak()
    println(ahmed.addTwoNumbers(5,10))
}