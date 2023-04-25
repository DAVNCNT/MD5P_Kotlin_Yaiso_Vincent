fun main() {
    //variables
    print("Enter fare: ")
    val fare = readLine()!!.toDouble()
    print("Passenger type [O,S,C]: ")
    val fareCode = readLine()!!.toUpperCase()
    print("Traveling in business class [Y/N]: ")
    val isBusinessClass = readLine()!!.equals("Y", ignoreCase = true)

    val discount: Double
    val businessClassCharge: Double

    when (fareCode) {
        "O" -> {
            discount = 0.0
            businessClassCharge = if (isBusinessClass) 1000.0 else 0.0
        }
        "S" -> {
            discount = 0.05
            businessClassCharge = if (isBusinessClass) 700.0 else 0.0
        }
        "C" -> {
            discount = 0.1
            businessClassCharge = if (isBusinessClass) 500.0 else 0.0
        }
        else -> {
            discount = 0.0
            businessClassCharge = 0.0
        }
    }

    val discountAmount = fare * discount
    val newFare = fare - discountAmount + businessClassCharge

    println("Discount is ${"%,.2f".format(discountAmount)}")
    println("Business class charge is ${"%,.2f".format(businessClassCharge)}")
    println("New fare is ${"%,.2f".format(newFare)}")
}