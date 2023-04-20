fun main(){
    //variable
    var num = 0

    //Input
    println("Enter a number: ")
    num = readln().toInt()

    if (num == 0) {
        println("The Number is Zero")
    }else if (num > 0){
        println("The Number is Positive")
    }else if (num < 0) {
        println("The Number is Negative")
    }
}