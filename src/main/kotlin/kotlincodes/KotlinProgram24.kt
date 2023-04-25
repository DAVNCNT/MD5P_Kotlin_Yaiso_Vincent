fun main(){
    //Set - immutable
    var numbers = setOf<Int>(1, 2, 3, 4, 5)
    //println(numbers.elementAt(0))

    var ctr = 0
    while (ctr < numbers.size) {
        println(numbers.elementAt(ctr))
        ctr++
    }
    println("WWWWWWWWWWWWWWWW")
    var number2 = mutableListOf<Int>(2,3,4,5,6,7)
    number2.add(9)
    number2.remove(3)

    var ctr2 = 0
    while (ctr2 < number2.size){
        println(number2.elementAt(ctr2))
        ctr2++
    }
}