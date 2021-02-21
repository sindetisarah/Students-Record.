
data class Student(val name:String,
                   val age:Int, val phoneNumber:String,
                   val weight:Double,
                   val citizen:Boolean)

fun main(args:Array<String>) {
    val stu=Student("sarah",23,"0721406307",50.5,true)


    println("Stud name is:${stu.name}")
    println("Stud weight is:${stu.weight} kgs")
    println("Stud age is:${stu.age}")
    println("Stud phoneNumber is:${stu.phoneNumber}")
    println("Valid kenyan citizen:${stu.citizen}")
}




