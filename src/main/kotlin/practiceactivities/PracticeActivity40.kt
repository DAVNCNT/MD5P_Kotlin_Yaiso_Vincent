fun main(){
    //variables
    var string = ""

    //Input
    println("Enter a string: ")
    string = readln()

    //Output
    var result = removeDuplicates(string)
    println("String with duplicates removed: $result")
}

fun removeDuplicates(text: String): String {
    var noReps = ""
    var letters = HashSet<Char>()

    for (char in text){
        if (letters.add(char))
            noReps += char
    }

    return noReps
}