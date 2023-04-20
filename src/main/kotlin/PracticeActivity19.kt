fun main() {
    //variable
    var number = 0.0

    //Input
    print("Enter a positive integer: ")
    number = readln().toDouble()

    var factorial = 1
    var counter = 0

    //Process
    do {
        factorial *= 1
        counter++
        } while (counter <= number)
        println("$number! = $factorial")
}
