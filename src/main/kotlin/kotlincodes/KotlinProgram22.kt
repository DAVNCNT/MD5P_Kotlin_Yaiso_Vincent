fun main(){
    //listOf
    //listOf if immutable
    var names = listOf<String>("paul", "Jonh", "Vincent", "george")
    println("List size is${names.size}")

    var ctr = 0
    while (ctr < names.size){
        println(names[ctr])
        ctr++
    }
    println("VVVVVVVVVVVVVVv")

    //to change the value in the list use the mutableListOf
    var riverMaya = mutableListOf<String>("Bamboo", "Rico", "Perf", "Juan")
    riverMaya.removeAt(0)
    riverMaya.remove("Rico")
    riverMaya.add("John")
    riverMaya.add(2,"Peter")
    var ctr1 = 0
    while (ctr1 < riverMaya.size){
        println(riverMaya[ctr1])
        ctr1++
    }

}