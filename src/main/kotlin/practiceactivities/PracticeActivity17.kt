fun main() {

    // variable declaration
    var counter = 1
    var number= 0
    var total= 0
    var average = 0.0

    // Input
    while (counter < 6) {
        println("Enter Number $counter: ")
        number = readln().toInt()
        total += number
        counter++
    }

    //computation
    average = total.toDouble() / 5
    println("Average is $average")

}