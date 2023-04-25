fun main() {
    //variables
    var rows = 5
    var ctrl1 = 0
    while (ctrl1 < rows) {
        var ctrl2 = rows
        while (ctrl2 > ctrl1) {
            print("* ")
            ctrl2--
        }
        println()
        ctrl1++
    }
}