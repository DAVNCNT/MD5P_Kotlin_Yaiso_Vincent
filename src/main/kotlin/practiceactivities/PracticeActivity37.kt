fun main() {
    //variables
    var length = 0.0
    var width = 0.0

    //Input
    print("Enter length: ")
    length = readln().toDouble()

    print("Enter width: ")
    width = readln().toDouble()

    println()

    //Output
    var perimeter = calculatePerimeter(length, width)
    println("Perimeter is ${"%,.2f".format(perimeter)} meters.")

    var area = calculateArea(length, width)
        println("Area is ${"%,.2f".format(area)} meters.")

}

fun calculatePerimeter(length: Double, width: Double): Double{
    var perimeter = (length + width) * 2
    return  perimeter
}

fun calculateArea(length: Double, width: Double): Double{
    var area = length * width
    return area
}