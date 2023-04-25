fun main(){
    //variable declaration
    var price : Double = 0.00
    var product = "item"


    //Input
    println("Enter Product: ")
    product = readln()
    println("Enter Price: ")
    price = readln().toDouble()

    //Process
    var discount0 = price * .0
    var discount5 = price * .05
    var discount10 = price * .10
    var discount15 = price * .15
    var discount20 = price * .20
    var profit1 = price - discount0
    var profit2 = price - discount5
    var profit3 = price - discount10
    var profit4 = price - discount15
    var profit5 = price - discount20

    if (price <=10000) {
        println("\nThe Price of $product is $price")
        println("Discount is ${String.format("%.2f", discount0)}")
        println("Net Profit is ${String.format("%.2f",profit1)}")
    }else if (price <=20000) {
        println("\nThe Price of $product is $price")
        println("Discount is ${String.format("%.2f", discount5)}")
        println("Net Profit is ${String.format("%.2f",profit2)}")
    }else if (price <=50000) {
        println("\nThe Price of $product is $price")
        println("Discount is ${String.format("%.2f", discount10)}")
        println("Net Profit is ${String.format("%.2f",profit3)}")
    }else if (price <=100000) {
        println("\nThe Price of $product is $price")
        println("Discount is ${String.format("%.2f", discount15)}")
        println("Net Profit is ${String.format("%.2f", profit4)}")
    }else if (price >=100000) {
        println("\nThe Price of $product is $price")
        println("Discount is ${String.format("%.2f", discount20)}")
        println("Net Profit is ${String.format("%.2f",profit5)}")
    }
}