fun main() {
    //variable
    var number = 0

    //Input
    print("Enter a positive integer: ")
    number = readln().toInt()

    repeat(number) { i ->
        if (i % 2 != 0) {
            println(i)
        }
    }
}
