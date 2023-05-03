fun main () {
    //variables
    var number = 0

    //Input
    print("Enter a positive integer: ")
    number = readln().toInt()

    //Output
    var factorial = findFactorial(number)
    println("Factorial: $factorial")
}

fun findFactorial(num:Int): Int{
    var factorial = 1
    var counter = 0
    counter = num

    do {
        factorial *= counter
        counter--
    } while (counter > 0)

    return factorial
}