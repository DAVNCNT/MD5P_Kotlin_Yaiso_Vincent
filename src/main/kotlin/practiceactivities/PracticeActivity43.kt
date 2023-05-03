fun main(){
    //variables
    var weight = 0.0
    var height = 0.0

    //Input
    print("Enter you weight: ")
    weight = readln().toDouble()
    print("Enter your height: ")
    height = readln().toDouble()

    //Output
    println()
    var bmi = calculateBMI(weight, height)
    println("BMI: ${String.format("%.2f", bmi)}")

}

fun calculateBMI (weight:Double, height:Double): Double{
    var bmi = weight / (height*height)
    return bmi
}