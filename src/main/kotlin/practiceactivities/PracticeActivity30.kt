fun main (){
    //variables
    val nameAndPhone = mapOf("Alice" to "555-1234", "Bob" to "555-5678", "Charlie" to "555-9101")

    //Input
    println("Default Map Data")
    println("Name\t\tPhone number")
    println("Alice\t\t555-1234")
    println("Bob\t\t\t555-5678")
    println("Charlie\t\t555-9101")

    println()
    print("What is the name? ")
    val name = readln()

    //Process
    for ((key, value) in nameAndPhone){
        if (name == key) {
            println("$name's phone number is $value.")
        }
    }
}