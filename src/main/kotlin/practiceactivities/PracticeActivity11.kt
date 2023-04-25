fun main(){
    //Variables
    var name = "vince"

    //Input
    println("Enter name: ")
    name = readln()
    println("Enter grade in English: ")
    var gradeEnglish = readln().toDouble()
    println("Enter grade in Math: ")
    var gradeMath = readln().toDouble()
    println("Enter grade in Science: ")
    var gradeScience = readln().toDouble()

    //Process
    var average = (gradeEnglish + gradeMath + gradeScience) / 3

    if (average >100) {
        println("Invalid Grade!")
    }else if (average <78) {
        println("$name's average grade is ${String.format("%.2f", average)}")
        println("Failure")
    }else if (average <83) {
        println("$name's average grade is ${String.format("%.2f", average)}")
        println("Fair")
    }else if (average <89) {
        println("$name's average grade is ${String.format("%.2f", average)}")
        println("Average Student")
    } else if (average <95) {
        println("$name's average grade is ${String.format("%.2f", average)}")
        println("Dean's Lister")
    }else if (average <=100){
        println("$name's average grade is ${String.format("%.2f", average)}")
        println("President's Lister")
    }
}