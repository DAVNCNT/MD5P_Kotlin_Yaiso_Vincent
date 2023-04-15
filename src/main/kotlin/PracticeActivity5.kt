fun main() {
    //Input - Process
    println("Enter Name of Student:")
    var name = readln()
    println("\nEnter Number of Units Enrolled:")
    var unit = readln().toFloat()
    println("\nPrice per Unit is:")
    var price = readln().toFloat()

    var tuition = unit * price

    println(
        "\n$name, you could avail the following payment mode: " +
                "\n10% Discount if Cash \n10% interest if 3 installments \n5% interest if 2 installment"
    )

    println("\nComputed Tuition Fee = ${String.format("%.2f", tuition)} Dollars")
    println("\nPayment mode: ")

    //computation = tuition - tuition * %

    var cashDiscount = tuition - (tuition * .10)
    println("\nYour Tuition if Cash Payment : ${String.format("%.2f", cashDiscount)} Dollars")

    //2 installment computation = tuition + tuition*.05

    var installment2 = tuition + (tuition * .05)
    println("Your Tuition if 2-Installment : ${String.format("%.2f", installment2)} Dollars")

    //3 installment computation = tuition + tuition*.05

    var installment3 = tuition + (tuition * .10)
    println("Your Tuition if 3-Installment : ${String.format("%.2f", installment3)} Dollars")


}
