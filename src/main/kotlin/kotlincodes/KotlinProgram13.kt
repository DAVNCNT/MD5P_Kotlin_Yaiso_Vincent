fun main(){
    //when statement - sa java and other language it's called switch statement
    //digits to words

    var num = 0
    println("Enter a number: ")
    num = readln().toInt()

    //when statement
    when (num){
        1 -> {
            println("one")
        }
        2 -> {
            println("two")
        }
        3 -> {
            println("three")
        }
        else -> {
            println("Invalid Number!")
        }
    }
}