fun main(){
    //Input
    println("What is your name?")
    var name = readln()

    println("\nEnter Current Year: ")
    var currentYear = readln().toInt()

    println("\nEnter Birth Year: ")
    var birthYear = readln().toInt()

    //Process
    var age = "${currentYear - birthYear}"

    println("$name, your age on $currentYear is $age")
}