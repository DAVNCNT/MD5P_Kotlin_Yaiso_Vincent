fun main (){
    //variables
    var totalSquare = 0
    var totalCube = 0

    //Input - process
    println("Number\t\tSquare\t\tCube")

    for (number in 2..10 step 2){ //use step command for interval
        val square = number * number
        val cube = number * number * number

        totalSquare += square
        totalCube += cube

        println("$number\t\t\t$square\t\t\t$cube") // use "\t" for  aligning tab
    }
    println("Total\t\t$totalSquare\t\t\t$totalCube")
}