fun main(){
    //Variable
    var matrix = mutableListOf(
        mutableListOf(0,0,0),
        mutableListOf(0,0,0),
        mutableListOf(0,0,0),
        )
    var number = 0



    //Input - Process
    var row = 0
    var control = 1
    while (row  < matrix.size){
        var column = 0
        while (column < matrix[row].size) {
            print("Enter a number $control: ")
            number = readln().toInt()
            matrix[row][column] = number
            column++
            control++
        }
        row++
    }
    println()

    //Output
    row = 0
    while (row < matrix.size){
        var column = 0
        while (column < matrix[row].size){
            print("${matrix[row][column]}\t")

            column++
        }
        println()
        row++
    }

}
