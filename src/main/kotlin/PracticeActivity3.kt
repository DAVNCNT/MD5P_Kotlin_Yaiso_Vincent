fun main(){
    // Input
    println("Enter Item: ")
    var item = readln()

    println("\nPrice in day 1: ")
    var day1 = readln().toFloat()

    println("\nPrice in day 2: ")
    var day2 = readln().toFloat()

    println("\nPrice in day3: ")
    var day3 = readln().toFloat()

    var average = "${ (day1+ day2 + day3) / 3}"


    println("\nThe Average Price of Gasoline in 3 days is $average per gallon")
}