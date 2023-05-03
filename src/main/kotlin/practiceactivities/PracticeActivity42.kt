fun main(){
    //variables
    var string = ""
    var character = 'a'

    //Input
    print("Enter a string: ")
    string = readln()
    print("Enter a character: ")
    character = readln().first()

    //Process - Output
    var count = countOccurence(string,character)
    if (count > 0) {
        println("Character count: $count")
    } else{
        println("Character not found!!!")
    }

}

fun countOccurence(text: String, char: Char):Int {
    var textLength = text.length
    var textSize = textLength - 1
    var vowel = 0
    for (ctrl in 0..textSize) {
        if (text[ctrl] == char) {
            vowel += 1
        }
    }
    return vowel

}