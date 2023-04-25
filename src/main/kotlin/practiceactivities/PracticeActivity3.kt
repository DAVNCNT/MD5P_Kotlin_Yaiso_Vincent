fun main(){
    // Input
    println("Enter Item: ")
    var item = readln()

    println("\nPrice in day 1: ")
    var day1 = readln().toFloat() //use Double

    println("\nPrice in day 2: ")
    var day2 = readln().toFloat() //use Double

    println("\nPrice in day3: ")
    var day3 = readln().toFloat() //use Double

    var average = "${ (day1+ day2 + day3) / 3}"


    println("\nThe Average Price of $item in 3 days is $average per gallon")
}