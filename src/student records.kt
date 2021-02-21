
data class Student(val name:String,
                   var age:Int,
                   val phoneNumber:String,
                   var weight:Double,
                   var citizen:Boolean)

fun main(args:Array<String>) {
    val stu=Student("sarah sindet",23,"0721406307",50.5,true)
    val stu2=Student("mercy omondi",28,"0721406307",50.6,true)


    println("Stud name is:${stu.name}")
    println("Stud weight is:${stu.weight} kgs")
    println("Stud age is:${stu.age}")
    println("Stud phoneNumber is:${stu.phoneNumber}")
    println("Valid kenyan citizen:${stu.citizen}")

    println("Stu2 name is:${stu2.name}")
    println("Stu2 weight is:${stu2.weight} kgs")
    println("Stu2 age is:${stu2.age}")
    println("Stu2 phoneNumber is:${stu2.phoneNumber}")
    println("Valid kenyan citizen:${stu2.citizen}")
}




