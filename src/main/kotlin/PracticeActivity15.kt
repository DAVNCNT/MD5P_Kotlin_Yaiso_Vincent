fun main (){
    //variable
    var a = 1
    var b = 2
    var c = 3

    //Input
    println("Enter the first number: ")
    a = readln().toInt()
    println("Enter the second number: ")
    b = readln().toInt()
    println("Enter the three number: ")
    c = readln().toInt()

    //Process
    if ((a*a) + (b*b) == (c*c)) {
        println("These numbers form a Pythagorean Triple.") }
    else { println("These numbers do not form a Pythagorean Triple.") }
}