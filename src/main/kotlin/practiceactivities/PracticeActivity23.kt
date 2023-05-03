package practiceactivities

import java.util.SimpleTimeZone

fun main (){
    var number = arrayListOf<Int>()
    var enteredNumber = 0
    var ctrl = 0

    //Input

    while (ctrl <= number.size) {
        println("Enter number ${ctrl + 1}: ")
        enteredNumber = (readln().toInt())
        number.add(enteredNumber)
        if (ctrl == 4){
            break
        }
        ctrl++
    }
    if (enteredNumber %2 == 0){
        println()
    }

}