fun main(){
    // if-else if statement
    // < > <= >= == !=
    // age is 0 - 12, kids
    // age is 13 - 18, teenagers
    // age is 19 - 59, adults
    // age is 60 above, senior citizen
    // age is <0, invalid age

    //variable
    var age = 0

    println("please enter your age: ")
    age = readln().toInt()

    if(age >= 60){
        println("\nYour age is $age")
        println("You are a Senior Citizen.")
    }else if(age >= 19){
        println("\nYour age is $age")
        println("You are an Adult.")
    }else if(age >= 13){
        println("\nYour age is $age")
        println("You are a Teenager.")
    }else if(age >= 0) {
        println("\nYour age is $age")
        println("You are a Kid.")

    }else{
        println("Invalid Age!")
    }
}