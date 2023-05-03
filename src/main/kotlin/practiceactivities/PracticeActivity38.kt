fun main(){
    //variables
    var numberOfEggs = 0

    //Input
    print("Enter the number of eggs: ")
    numberOfEggs = readln().toInt()

println()

    //Output
    var dozen = determineDozen(numberOfEggs)
    println("Number of dozen: $dozen")

    var remainingEggs = showLessDozen(numberOfEggs)
    println("Eggs less than a dozen: $remainingEggs")

}

fun determineDozen(eggs:Int): Int {
    var dozen = eggs/12
    return dozen
}

fun showLessDozen(eggs: Int): Int{
    var remainingEggs = eggs %12
    return remainingEggs
}