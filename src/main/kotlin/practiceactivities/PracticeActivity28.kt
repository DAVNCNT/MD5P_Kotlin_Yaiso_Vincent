fun main() {
    //Variables
    var option = 'a'

    //Input
    do {
        println("Main Menu")
        println("a. Celsius to Fahrenheit")
        println("b. Fahrenheit to Celsius")
        println("c. Exit")
        print("Choose option [a, b, or c]: ")
        option = readln().first()

        when (option) {
            'a' -> {
                println("Celsius to Fahrenheit Conversion")
                print("Enter celsius: ")
                var celsius = readln().toDouble()
                var fahrenheit = ((9.0 / 5.0) * celsius + 32.0)
                println("Fahrenheit equivalent is ${String.format("%.2f", fahrenheit)}")
            }

            'b' -> {
                println("Fahrenheit to Celsius Conversion")
                print("Enter Fahrenheit: ")
                var fahrenheit = readln().toDouble()
                var celsius = (fahrenheit - 32.0) / 1.8
                println("Celsius equivalent is ${String.format("%.2f", celsius)}")
            }

            'c' -> {
                println("End of program. Good bye!")
            }

            else ->
                println("Invalid Option! Choose only [a, b, c].")
        }
        println()
    }
    while (option != 'c')
}