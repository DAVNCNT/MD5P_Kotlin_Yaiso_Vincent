fun main(){
    //repeat statement
    repeat(5){//it is usually the var
        println("Enter number ${it + 1}")
    }
    repeat(5){counter ->
        println("Enter number ${counter +1}")
    }
}