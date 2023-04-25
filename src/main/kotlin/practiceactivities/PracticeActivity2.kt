fun main(){
    //formula of parameter is
    // P = 2(L + W)
    //formula of an area is
    // A = W * L

    println("Enter Length:")
    var length = readln().toFloat()

    println("Enter Width:")
    var width = readln().toFloat()

    var computation = "${2*(length + width)}"
    println("The Parameter is $computation meters")

    var computation2 = "${width * length}"
    println("Thr Area is $computation2 meters")



}