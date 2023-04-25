fun main(){
    //variable
    var number = 0

    //Input
    println("Enter a positive number: ")
    number = readln().toInt()

    //Process
    for (num in 1..10){
        println("$number * $num = ${number * num}")
    }
}