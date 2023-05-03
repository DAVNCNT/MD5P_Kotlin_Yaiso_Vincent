fun main(){
    //variables
    var celsius = 0.0

    //Input
    print("Enter Temperature: ")
    celsius = readln().toDouble()

    //Output
    var fahrenheit = convertTemperature(celsius)
    println("Temperature in Fahrenheit: ${String.format("%.2f", fahrenheit)}")
}

fun convertTemperature(celsius:Double): Double{
    var fahrenheit = (celsius * 9/5) + 32
    return fahrenheit
}