fun main (){
    //variable
    var num = 25

    //Input - Process
    for (ctrl in 1..5){
        for (ctrl2 in 1..5){
            print("$num\t")
            num-=5
        }
        println()
        num += 24
    }
}