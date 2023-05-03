fun main (){
    //variable
    var baseSize = 0

    //Input
    print("Enter a base size of the dollar triangle: ")
    baseSize = readln().toInt()

    //Process
    for (ctrl in 1..baseSize) {
        for (ctrl1 in 1..baseSize - ctrl) {
            print("  ")
        }
        for (ctrl2 in 1..ctrl) {
            print("$")
            if (ctrl2 < ctrl) {
                print(" ")
            }
        }
        println()
    }

    }
