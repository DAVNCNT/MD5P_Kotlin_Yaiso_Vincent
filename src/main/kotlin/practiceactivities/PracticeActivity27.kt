fun main () {
    //variables
    var num = 0




    //Input
    print("Enter matrix to generate (n by n): ")
    num = readln().toInt()
    var row = num * num

    //Process
    for (ctrl in 1..num) {
        for (ctrl2 in 1..num) {
            var itCheck = ctrl % 2
            if (itCheck == 0) {
                row++
                print("$row\t")

            }
            else{
                print("$row\t")
                row--
            }
        }
        println()
        row -=  num
    }
}