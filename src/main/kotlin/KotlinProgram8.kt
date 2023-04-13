fun main(){
    //declare variables
    var number1 = 0
    var number2 = 0
    var sum = 0
    var difference = 0
    var product = 0
    var quotient = 0
    var modulo = 0

    //input
    println("Enter your first number: ")
    number1 = readln().toInt()
    println("Enter your second number: ")
    number2 = readln().toInt()

    //process
    sum = number1+number2
    difference = number1-number2
    product = number1*number2
    quotient = number1/number2
    modulo = number1%number2

    //output
    println("The sum is $sum")
    println("The difference is $difference")
    println("The product is $product")
    println("The quotient is $quotient")
    println("The remainder is $modulo")

}