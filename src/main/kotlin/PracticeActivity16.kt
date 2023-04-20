fun main(){
    //variable

    var number1 = 0
    var number2 = 0
    var number3 = 0

    //Input
    println("Enter the first number: ")
    number1 = readln().toInt()
    println("Enter the second number: ")
    number2 = readln().toInt()
    println("Enter the third number: ")
    number3 = readln().toInt()

    //Process
    if ((number1 <number2) && (number1 < number3)){
        println("The smallest number is $number1")
    }else if((number2 <number1) && (number2 < number3)){
        println("The smallest number is $number2")
    }else if((number3 <number1) && (number3 < number2)) {
        println("The smallest number is $number3")
    }
}