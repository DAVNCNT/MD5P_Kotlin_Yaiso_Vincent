fun main(){
    //variables
    var year = 0

    //Input
    println("Enter a year: ")
    year = readln().toInt()

    //Process
    if ((year %100 == 0) && (year %400 != 0)){
        println("$year is not a leap year.")
    } else if (year %4 == 0){
        println("$year is a leap year.")
    } else {
        println("$year is not a leap year")
    }
}