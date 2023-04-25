fun main(){
    //if-else Statement
    // < > <= >= == !=

    //var declaration
    var age = 18

    println("please enter your age: ")
    age = readln().toInt()

    if(age >= 18){
        println("\nYour age is $age")
        println("You are qualified to vote!")
    }else{
        println("\nYour age is $age")
        println("You are NOT qualified to vote!")
    }
    println("This will always display!")
}