fun main(){
    //if Statement
    // < > <= >= == !=

    //var declaration
    var age = 0

    println("please enter your age: ")
    age = readln().toInt()

    if(age >= 18){
        println("\nYour age is $age")
        println("You are qualified to vote!")
    }
    println("This will always display!")
}