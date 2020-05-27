import java.io.File

fun greater(x: Int, y: Int){
    return if(y < x){
        print(-1)
    }
    else if (y>x){
        print(1)
    }
    else{
        print(0)
    }
}

fun age(age: Int){
    when(age){
        in 0..20 -> print("Family")
        in 60..100 ->print("Senior")
        else -> print("Normal")
    }
}

fun prob3(){
    var cardPoints = 7_000
    var cardLevel = ""
    cardLevel = when (cardPoints){
        in 0..1000 -> "pearl"
        in 1001..5_000 -> "silver"
        in 5_000..10_000 -> "gold"
        else -> "platinum"
    }
    val plural = if(cardPoints > 1 || cardPoints == 0) "s" else ""
    println("You have $cardPoints point$plural and are at the $cardLevel level.")

}

fun readFile(fileName: String) = File(fileName).forEachLine { println(it) }

fun inherit(){
    open class Person(age: Int, name: String) {
        init {
            println("My name is $name.")
            println("My age is $age")
        }
    }

    class MathTeacher(age: Int, name: String): Person(age, name) {
        fun teachTeacher() {
            println("I teach in CSUSB")
        }
    }

    class Footballer(age: Int, name: String): Person(age, name) {
        fun playFootball() {
            println("I play for LA RAMS")
        }
    }

    class Businessman(age: Int, name: String): Person(age, name) {
        fun doesBusinessman() {
            println("I work for FB")
        }
    }


    val t1 = MathTeacher(25, "Tony")
    t1.teachTeacher()

    println()

    val f1 = Footballer(29, "Henry")
    f1.playFootball()

    println()

    val b1 = Businessman(29, "Henry")
    b1.doesBusinessman()

}

fun main(){
    // val const

    //prob 1
    print("enter a x val: ")
    var x = readLine().toString().toInt()
    print("enter a y val: ")
    var y = readLine().toString().toInt()
    greater(x,y)
    println()

    //prob 2
    print("enter an age: ")
    var age = readLine().toString().toInt()
    age(age)
    println()
    print("test age 25: ")
    age(25)
    println()
    print("test age 65: ")
    age(65)
    println()

    //prob 3
    prob3()
    println()
    //prob 4
    readFile("readtest.txt")
    println()
    //prob 5
    inherit()
}
