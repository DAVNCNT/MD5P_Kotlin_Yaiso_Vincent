fun main (){
    //variables
    var string = ""

    //Input
    println("Enter a string: ")
    string = readln()

    //Output
    var result = replaceSpaces(string)
    println("String with spaces replaced: $result")
}

fun replaceSpaces(text: String): String {
    var result = text.replace(" ", "_")
    return result
}
