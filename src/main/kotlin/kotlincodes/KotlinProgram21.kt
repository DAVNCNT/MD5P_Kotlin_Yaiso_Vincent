fun main (){
    var names = arrayOf("Paul", "John", "ringo", "george")
    //to restrict array put the data type beside the arrayOf<data type>
    println("Array size is ${names.size}")

    var ctr = 0
    while (ctr < names.size){
        println(names[ctr])
        ctr++
    }
}