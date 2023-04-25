fun main() {
    //arrayList
    //mutable list
    var name = ArrayList<String>()
    println("Enter name1: ")
    name.add(readln())
    println("Enter name2: ")
    name.add(readln())
    println("Enter name3: ")
    name.add(readln())

    var ctr = 0
    while (ctr < name.size) {
        println(name[ctr])
        ctr++
    }
}