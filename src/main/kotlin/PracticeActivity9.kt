fun main(){
    //variable
    var num = 0

    // Input
    println("Enter a number: ")
    num = readln().toInt()

    when (num){
        1 -> {
            println("The corresponding day of the week is Monday.")
        }
        2 -> {
            println("The corresponding day of the week is Tuesday.")
        }
        3 -> {
            println("The corresponding day of the week is Wednesday.")
        }
        4 -> {
            println("The corresponding day of the week is Thursday.")
        }
        5 -> {
            println("The corresponding day of the week is Friday.")
        }
        6 -> {
            println("The corresponding day of the week is Saturday.")
        }
        7 -> {
            println("The corresponding day of the week is Sunday.")
        }else -> {
            println("ERROR!!! PLEASE ENTER A NUMBER BETWEEN 1 TO 7.")
        }
    }
}