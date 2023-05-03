fun main(){
    //variables
    var text = ""

    //Input
    println("Enter a Text: ")
    text = readln()

    //Output
    var reverse = reverseText(text)
    println(reverse)
}

fun reverseText(text:String):String{
    var reverse = text.reversed()
    return reverse
}