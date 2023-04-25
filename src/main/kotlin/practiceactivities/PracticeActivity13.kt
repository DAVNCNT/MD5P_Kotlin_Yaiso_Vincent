fun main() {
    //variables
    var weight = 0.00
    var height = 0.00

    //Input
    println("Enter you Weight (in kg): ")
    weight = readln().toDouble()
    println("Enter you Height (in meters): ")
    height = readln().toDouble()

    //Process - Output
    var bmi = weight / (height * height)

    if (bmi < 18.5) {
        println("\nYour BMI is ${String.format("%.2f", bmi)}, which is in the Underweight range.")
    } else if (bmi < 25) {
        println("\nYour BMI is ${String.format("%.2f", bmi)}, which is in the Normal Weight range.")
    } else if (bmi < 30) {
        println("\nYour BMI is ${String.format("%.2f", bmi)}, which is in the Overweight range.")
    } else {
        println("\nYour BMI is ${String.format("%.2f", bmi)}, which is in the Obese range.")
    }
}