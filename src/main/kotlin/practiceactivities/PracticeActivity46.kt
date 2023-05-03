fun main(){
    //Variable
    var number = mutableListOf<Double>()

    //Input
    for (ctrl in 1..5){
        print("Enter Number $ctrl: ")
        number.add(readln().toDouble())
    }

    //Output
    var average = computeAverage(number)
    println("Average: ${String.format("%.2f", average)}")

}

fun computeAverage(list: MutableList<Double>): Double{
    var sum = 0.0
    var average = 0.0

    for (ctrl in 0..4){
        sum += list[ctrl]
    }
    average = sum / 5
    return average
}