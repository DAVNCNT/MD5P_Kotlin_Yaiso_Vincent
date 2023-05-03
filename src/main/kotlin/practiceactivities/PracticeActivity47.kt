fun main(){
    //variables
    var string = "vince"

    //Input
    print("Enter a string: ")
    string = readln()

    //Output
    var count = countWords(string)
    println("Number of words: $count")

}

fun countWords(text:String): Int {
    var counts = text.split("\\s+".toRegex())
    return counts.size
}