fun main(){
    //default username and password
    var defaultUsername = "Admin"
    var defaultPassword = "Pass123"

    //Input
    println("Enter your Username: ")
    var username = readln()
    println("Enter your Password: ")
    var password = readln()

    //Process
    if((username == defaultUsername) && (password == defaultPassword)){
        println("Logged in!")
    }else{
        println("Invalid Username or Password")
    }
}