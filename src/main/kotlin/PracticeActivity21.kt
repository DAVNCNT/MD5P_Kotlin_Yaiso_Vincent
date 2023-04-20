fun main() {
    //variable
    var ctrl1 = 1
    while (ctrl1 <= 5) {
        var ctr2 = 1
        while (ctr2 <= ctrl1) {
            print("$ctr2 ")
            ctr2++
        }
        println()
        ctrl1++
    }
}