fun main(){
    //variables
     var score = 0

    //Input
    println("Enter you score: ")
    score = readln().toInt()

    if (score >=90){
        println("Your grade is A")
    }else if (score >=80){
        println("Your grade is B")
    }else if (score >=70) {
        println("Your grade is C")
    }else if (score >=60) {
        println("Your grade is D")
    }else if (score <60) {
        println("Your grade is F")
    }
}