fun main(){
    //Variables
    var number = mutableListOf<Int>()

    //Input
    for (num in 1..5) {
        print("Enter number $num: ")
        number.add(readln().toInt())

    }
    println()
}